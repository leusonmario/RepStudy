import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = eventBus7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl20.compiler;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl20.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl20.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
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
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl19.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl19.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl19.eventBus = eventBus29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl19.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl19.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl19.eventBus = eventBus34;
        io.cloudslang.score.api.Score score36 = null;
        slangImpl19.score = score36;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler38 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score39 = null;
        slangImpl19.score = score39;
        io.cloudslang.score.api.Score score41 = null;
        slangImpl19.score = score41;
        java.util.Set<java.lang.String> strSet43 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(slangCompiler38);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
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
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl13.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl13.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl13.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
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
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl11.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl11.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl11.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl11.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl11.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet23);
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener26);
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl21.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl21.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = slangImpl21.score;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl21.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet31);
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl9.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl9.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl9.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl9.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl9.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl9.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl9.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl9.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet20 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl19.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl19.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl19.compiler = slangCompiler31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl19.compiler;
        java.util.Set<java.lang.String> strSet34 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet37 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score25 = slangImpl24.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl24.compiler = slangCompiler26;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl24.eventBus = eventBus28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl24.compiler;
        io.cloudslang.score.api.Score score31 = slangImpl24.score;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl24.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl24.compiler;
        io.cloudslang.score.api.Score score34 = slangImpl24.score;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl24.eventBus;
        io.cloudslang.score.events.EventBus eventBus36 = null;
        slangImpl24.eventBus = eventBus36;
        io.cloudslang.score.events.EventBus eventBus38 = null;
        slangImpl24.eventBus = eventBus38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl24.compiler;
        java.util.Set<java.lang.String> strSet41 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
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
        java.lang.Class<?> wildcardClass26 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        java.util.Set<java.lang.String> strSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet11 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl10.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl10.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl10.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl10.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl10.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl10.eventBus = eventBus24;
        java.util.Set<java.lang.String> strSet26 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = strSet18.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl20.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl20.compiler = slangCompiler25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl20.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl20.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl20.compiler = slangCompiler30;
        java.util.Set<java.lang.String> strSet32 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
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
        io.cloudslang.lang.compiler.SlangSource slangSource10 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact12 = slangImpl0.compile(slangSource10, slangSourceSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
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
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = slangCompiler24.getClass();
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
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl18.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = slangImpl18.score;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl18.score = score27;
        io.cloudslang.score.api.Score score29 = slangImpl18.score;
        io.cloudslang.score.api.Score score30 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet31 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = slangCompiler13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl19.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl19.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score29 = slangImpl19.score;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl19.compiler = slangCompiler32;
        java.util.Set<java.lang.String> strSet34 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet35 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl0.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(eventBus31);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl15.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl15.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl15.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl15.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl15.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl15.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl15.eventBus;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl18.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl18.score = score21;
        io.cloudslang.score.api.Score score23 = slangImpl18.score;
        io.cloudslang.score.api.Score score24 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score27 = slangImpl18.score;
        io.cloudslang.score.api.Score score28 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score30 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet31 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
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
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = slangImpl22.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl22.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl22.compiler = slangCompiler26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl22.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl22.eventBus = eventBus29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.api.Score score34 = slangImpl22.score;
        io.cloudslang.score.api.Score score35 = slangImpl22.score;
        io.cloudslang.score.events.EventBus eventBus36 = null;
        slangImpl22.eventBus = eventBus36;
        io.cloudslang.score.events.EventBus eventBus38 = slangImpl22.eventBus;
        io.cloudslang.score.api.Score score39 = null;
        slangImpl22.score = score39;
        java.util.Set<java.lang.String> strSet41 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNull(eventBus38);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet17 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl16.score;
        io.cloudslang.score.api.Score score21 = slangImpl16.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl16.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl16.compiler = slangCompiler24;
        io.cloudslang.score.api.Score score26 = slangImpl16.score;
        io.cloudslang.score.api.Score score27 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl16.compiler;
        java.util.Set<java.lang.String> strSet29 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl14.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet21 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet23 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet26 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet14 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl13.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl13.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass11 = strSet10.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl19.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl19.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl21.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = null;
        slangImpl21.score = score26;
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
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl11.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl11.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl11.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl11.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = slangCompiler4.getClass();
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
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl10.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl10.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl10.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl10.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl10.eventBus = eventBus21;
        java.util.Set<java.lang.String> strSet23 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl10.score = score24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl10.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl10.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl10.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl10.compiler;
        io.cloudslang.score.api.Score score32 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl10.compiler;
        java.util.Set<java.lang.String> strSet34 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
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
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = eventBus12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = slangCompiler13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl10.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl10.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl10.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl10.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl10.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl16.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl16.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl16.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl16.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl16.compiler = slangCompiler25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl16.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl16.compiler = slangCompiler29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl16.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl16.compiler = slangCompiler32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet36 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
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
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet22 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl21.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl21.score = score25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl21.eventBus;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl21.score = score28;
        io.cloudslang.score.api.Score score30 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl21.compiler;
        io.cloudslang.score.api.Score score32 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl21.compiler = slangCompiler33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl21.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl21.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl21.compiler;
        java.util.Set<java.lang.String> strSet38 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet38);
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangSource slangSource15 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource15, slangSourceSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet23 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl22.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = slangImpl22.score;
        java.util.Set<java.lang.String> strSet29 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl14.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl14.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl14.compiler = slangCompiler27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl14.compiler = slangCompiler30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus33 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet34 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNull(eventBus33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet19 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl18.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl18.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl18.score = score25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl18.score = score27;
        java.util.Set<java.lang.String> strSet29 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score30 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl18.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet33);
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl8.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl8.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl8.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl8.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl8.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl8.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl8.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = null;
        slangImpl8.score = score23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl8.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = slangCompiler13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl14.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl14.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl14.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score26 = slangImpl14.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl14.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = slangCompiler17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass28 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
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
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener25);
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
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        java.util.Set<java.lang.String> strSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl11.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl11.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl11.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl17.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet24 = slangImpl17.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl17.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl17.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score32 = null;
        slangImpl17.score = score32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl17.compiler = slangCompiler34;
        java.util.Set<java.lang.String> strSet36 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = slangImpl22.score;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl22.compiler = slangCompiler26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl22.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl22.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl22.compiler = slangCompiler30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl22.eventBus = eventBus32;
        java.util.Set<java.lang.String> strSet34 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl19.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl19.score = score27;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl19.score = score29;
        io.cloudslang.score.api.Score score31 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet32 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet33);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl15.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl12.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl12.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl12.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
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
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl11.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl11.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl11.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl11.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl12.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl12.score;
        io.cloudslang.score.api.Score score16 = slangImpl12.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl12.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet22 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl21.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = slangImpl21.score;
        io.cloudslang.score.api.Score score26 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl21.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl21.compiler;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl21.eventBus = eventBus29;
        java.util.Set<java.lang.String> strSet31 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet31);
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
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = eventBus17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet15 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl14.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl14.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl14.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl14.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet32 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl14.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(slangSourceArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(slangCompiler1);
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener27 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = score17.getClass();
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
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl12.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl12.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl12.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl12.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl12.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl17.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl17.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl17.compiler = slangCompiler25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl17.score = score27;
        io.cloudslang.score.api.Score score29 = slangImpl17.score;
        io.cloudslang.score.api.Score score30 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl17.eventBus = eventBus33;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl17.score = score35;
        java.util.Set<java.lang.String> strSet37 = slangImpl17.getAllEventTypes();
        java.util.Set<java.lang.String> strSet38 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus39 = null;
        slangImpl17.eventBus = eventBus39;
        java.util.Set<java.lang.String> strSet41 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet41);
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
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
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
        io.cloudslang.lang.compiler.SlangSource slangSource12 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact14 = slangImpl0.compile(slangSource12, slangSourceSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl16.score = score20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl16.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl16.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl16.compiler = slangCompiler26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl16.compiler;
        io.cloudslang.score.api.Score score29 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet32 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = null;
        slangImpl16.score = score33;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet36 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet37 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl17.score = score21;
        io.cloudslang.score.api.Score score23 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet21 = slangImpl20.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl20.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl20.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl20.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl20.eventBus = eventBus30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl20.compiler = slangCompiler32;
        java.util.Set<java.lang.String> strSet34 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet34);
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
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet17 = slangImpl13.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl13.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl13.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl13.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = score13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = eventBus12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet20 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl19.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet32);
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
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
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl10.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl10.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl10.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl10.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl10.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl0.compiler = slangCompiler26;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener28 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl29 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score30 = slangImpl29.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl29.compiler = slangCompiler31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl29.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl29.compiler;
        io.cloudslang.score.api.Score score36 = null;
        slangImpl29.score = score36;
        io.cloudslang.score.events.EventBus eventBus38 = slangImpl29.eventBus;
        io.cloudslang.score.events.EventBus eventBus39 = null;
        slangImpl29.eventBus = eventBus39;
        io.cloudslang.score.events.EventBus eventBus41 = slangImpl29.eventBus;
        io.cloudslang.score.events.EventBus eventBus42 = null;
        slangImpl29.eventBus = eventBus42;
        io.cloudslang.score.api.Score score44 = null;
        slangImpl29.score = score44;
        java.util.Set<java.lang.String> strSet46 = slangImpl29.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener28, strSet46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNull(eventBus38);
        org.junit.Assert.assertNull(eventBus41);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangSource slangSource6 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray7 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet8 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet8, slangSourceArray7);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact10 = slangImpl0.compile(slangSource6, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(slangSourceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl15.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl15.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl15.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet29);
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
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = slangCompiler8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler5);
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
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
        io.cloudslang.score.api.Score score27 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl12.eventBus = eventBus29;
        java.util.Set<java.lang.String> strSet31 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = slangCompiler9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl0.eventBus = eventBus26;
        java.lang.Class<?> wildcardClass28 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet14 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl13.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = eventBus11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl21.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl21.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl21.compiler;
        io.cloudslang.score.api.Score score28 = slangImpl21.score;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl21.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl21.compiler;
        io.cloudslang.score.api.Score score31 = slangImpl21.score;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl21.eventBus;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl21.score = score33;
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl21.eventBus;
        io.cloudslang.score.api.Score score36 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet37 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl19.score;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl19.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl19.score = score27;
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet9 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl8.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl8.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl8.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl8.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl8.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl8.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl8.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl8.score;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl8.eventBus = eventBus21;
        java.util.Set<java.lang.String> strSet23 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl13.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl13.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl13.score;
        io.cloudslang.score.api.Score score19 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl13.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl13.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl6 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score7 = slangImpl6.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl6.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl6.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl6.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl6.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl6.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl6.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl6.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener5, strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
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
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl19.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl19.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl19.compiler = slangCompiler27;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl19.score = score29;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl24.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl24.eventBus = eventBus26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl24.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl24.eventBus = eventBus30;
        io.cloudslang.score.api.Score score32 = slangImpl24.score;
        java.util.Set<java.lang.String> strSet33 = slangImpl24.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl24.compiler;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl24.score = score35;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl24.compiler;
        java.util.Set<java.lang.String> strSet38 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
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
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl0.score = score26;
        java.lang.Class<?> wildcardClass28 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.score.api.Score score15 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl13.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener17);
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
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
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus27);
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
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
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = score20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl14.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl14.compiler;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource15 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact17 = slangImpl0.compile(slangSource15, slangSourceSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener23);
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
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }
}

