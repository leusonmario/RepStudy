import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl0.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener30 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(eventBus29);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
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
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
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
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
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
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl21.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl21.eventBus;
        java.util.Set<java.lang.String> strSet25 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
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
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = slangCompiler23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl12.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl12.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl12.score = score26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl12.eventBus;
        java.util.Set<java.lang.String> strSet30 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet30);
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
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
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
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet13 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        java.lang.Class<?> wildcardClass27 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
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
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        java.util.Set<java.lang.String> strSet26 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl0.compiler = slangCompiler27;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener29 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl30 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet31 = slangImpl30.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl30.eventBus = eventBus32;
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl30.eventBus;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl30.score = score35;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl30.compiler;
        io.cloudslang.score.api.Score score38 = null;
        slangImpl30.score = score38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = null;
        slangImpl30.compiler = slangCompiler40;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = slangImpl30.compiler;
        io.cloudslang.score.events.EventBus eventBus43 = slangImpl30.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = null;
        slangImpl30.compiler = slangCompiler44;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler46 = slangImpl30.compiler;
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
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNull(slangCompiler42);
        org.junit.Assert.assertNull(eventBus43);
        org.junit.Assert.assertNull(slangCompiler46);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
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
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score27 = slangImpl26.score;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl26.eventBus = eventBus28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl26.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet32);
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
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass24 = strSet23.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl10.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl10.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl10.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl10.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl10.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl10.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl10.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl10.eventBus = eventBus26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl10.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl10.eventBus;
        java.util.Set<java.lang.String> strSet30 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
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
        io.cloudslang.score.api.Score score30 = null;
        slangImpl0.score = score30;
        io.cloudslang.score.api.Score score32 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score32);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl27 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl27.compiler;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl27.eventBus = eventBus29;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl27.score = score31;
        java.util.Set<java.lang.String> strSet33 = slangImpl27.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl27.eventBus;
        io.cloudslang.score.events.EventBus eventBus35 = null;
        slangImpl27.eventBus = eventBus35;
        io.cloudslang.score.events.EventBus eventBus37 = null;
        slangImpl27.eventBus = eventBus37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = null;
        slangImpl27.compiler = slangCompiler39;
        io.cloudslang.score.events.EventBus eventBus41 = null;
        slangImpl27.eventBus = eventBus41;
        java.util.Set<java.lang.String> strSet43 = slangImpl27.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus44 = slangImpl27.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler45 = null;
        slangImpl27.compiler = slangCompiler45;
        io.cloudslang.score.api.Score score47 = null;
        slangImpl27.score = score47;
        java.util.Set<java.lang.String> strSet49 = slangImpl27.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener26, strSet49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(eventBus44);
        org.junit.Assert.assertNotNull(strSet49);
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl15.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl15.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score25 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet26 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet26);
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
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
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl11.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl11.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl11.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl11.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl11.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl11.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl11.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl11.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl11.compiler;
        io.cloudslang.score.api.Score score27 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet28 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl18.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl18.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet25 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl18.eventBus = eventBus27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl18.compiler = slangCompiler29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = null;
        slangImpl18.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl18.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
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
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl15.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl15.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet25 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl19.compiler = slangCompiler30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl19.eventBus = eventBus32;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl19.eventBus = eventBus34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl19.compiler = slangCompiler36;
        java.util.Set<java.lang.String> strSet38 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet39 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
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
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        java.util.Set<java.lang.String> strSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
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
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.score.api.Score score12 = slangImpl10.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl10.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl10.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl14.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl14.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl14.eventBus;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
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
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet25 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl24.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = null;
        slangImpl24.score = score29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl24.compiler;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl24.eventBus;
        java.util.Set<java.lang.String> strSet33 = slangImpl24.getAllEventTypes();
        java.util.Set<java.lang.String> strSet34 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
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
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl19.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl19.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = slangCompiler9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl8.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl8.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl8.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl8.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl8.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl8.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = slangCompiler11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
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
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl12.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl12.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl12.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        io.cloudslang.score.api.Score score21 = slangImpl12.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl12.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl12.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl12.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl12.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
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
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
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
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
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
            slangImpl0.unSubscribeOnEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
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
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
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
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(slangSourceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl18.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score23 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl18.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
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
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
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
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass5 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl15.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl15.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score25 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
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
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl10.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl10.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl10.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl10.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl10.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = slangImpl10.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = score15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = slangCompiler20.getClass();
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
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl15.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl15.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl15.eventBus;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl15.eventBus = eventBus26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl15.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl15.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl15.compiler = slangCompiler30;
        java.util.Set<java.lang.String> strSet32 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = score20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl14.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl14.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl14.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl14.score = score24;
        java.util.Set<java.lang.String> strSet26 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl14.score = score28;
        java.util.Set<java.lang.String> strSet30 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
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
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
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
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl25 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score26 = slangImpl25.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl25.compiler = slangCompiler27;
        java.util.Set<java.lang.String> strSet29 = slangImpl25.getAllEventTypes();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl25.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl25.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = slangImpl25.score;
        java.util.Set<java.lang.String> strSet34 = slangImpl25.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus35 = slangImpl25.eventBus;
        java.util.Set<java.lang.String> strSet36 = slangImpl25.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener24, strSet36);
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
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(eventBus35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet25 = slangImpl24.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl24.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl24.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl24.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl24.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl24.compiler = slangCompiler32;
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl24.eventBus;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl24.score = score35;
        io.cloudslang.score.events.EventBus eventBus37 = slangImpl24.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler38 = null;
        slangImpl24.compiler = slangCompiler38;
        java.util.Set<java.lang.String> strSet40 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNull(eventBus37);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl18.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl18.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score25 = slangImpl18.score;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl18.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl18.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl18.eventBus = eventBus29;
        io.cloudslang.score.api.Score score31 = slangImpl18.score;
        io.cloudslang.score.api.Score score32 = slangImpl18.score;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl18.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl14.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl14.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl14.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl14.compiler;
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
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = slangCompiler9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        java.lang.Class<?> wildcardClass9 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23225");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23226");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23227");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl11.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl11.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl11.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl11.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl11.score = score22;
        io.cloudslang.score.api.Score score24 = slangImpl11.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl11.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl11.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23228");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23229");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23230");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23231");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23232");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23233");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23234");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23235");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test23236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23236");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = slangCompiler17.getClass();
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23237");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
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
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl18.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl18.compiler = slangCompiler31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl18.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl18.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl18.score = score37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet40 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test23238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23238");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23239");
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
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23240");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23241");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23242");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = eventBus8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23243");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23244");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23245");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23246");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23247");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test23248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23248");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23249");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23250");
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
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler25);
    }

    @Test
    public void test23251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23251");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23252");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener31 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl32 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl32.compiler;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl32.eventBus = eventBus34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl32.compiler;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl32.score = score37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl32.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl32.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler41 = null;
        slangImpl32.compiler = slangCompiler41;
        java.util.Set<java.lang.String> strSet43 = slangImpl32.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener31, strSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test23253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23253");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
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
        org.junit.Assert.assertNull(score1);
    }

    @Test
    public void test23254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23254");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23255");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23256");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23257");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23258");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        java.util.Set<java.lang.String> strSet22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23259");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23260");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23261");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23262");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23263");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23264");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test23265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23265");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23266");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23267");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23268");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        java.util.Set<java.lang.String> strSet26 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl0.eventBus = eventBus27;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl0.eventBus = eventBus29;
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
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23269");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23270");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass22 = strSet21.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23271");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23272");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23273");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23274");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl18.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl18.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl18.score = score22;
        io.cloudslang.score.api.Score score24 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23275");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23276");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test23277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23277");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23278");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23279");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23280");
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23281");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23282");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23283");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test23284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23284");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23285");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23286");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test23287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23287");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23288");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23289");
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
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23290");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23291");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23292");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        java.util.Set<java.lang.String> strSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23293");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23294");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23295");
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
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl0.eventBus = eventBus28;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl0.score = score30;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener32 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl33 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score34 = slangImpl33.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl33.compiler = slangCompiler35;
        io.cloudslang.score.events.EventBus eventBus37 = null;
        slangImpl33.eventBus = eventBus37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl33.compiler;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl33.score = score40;
        io.cloudslang.score.events.EventBus eventBus42 = slangImpl33.eventBus;
        io.cloudslang.score.api.Score score43 = slangImpl33.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = null;
        slangImpl33.compiler = slangCompiler44;
        io.cloudslang.score.events.EventBus eventBus46 = null;
        slangImpl33.eventBus = eventBus46;
        io.cloudslang.score.events.EventBus eventBus48 = null;
        slangImpl33.eventBus = eventBus48;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler50 = null;
        slangImpl33.compiler = slangCompiler50;
        io.cloudslang.score.api.Score score52 = slangImpl33.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler53 = null;
        slangImpl33.compiler = slangCompiler53;
        java.util.Set<java.lang.String> strSet55 = slangImpl33.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener32, strSet55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNull(eventBus42);
        org.junit.Assert.assertNull(score43);
        org.junit.Assert.assertNull(score52);
        org.junit.Assert.assertNotNull(strSet55);
    }

    @Test
    public void test23296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23296");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test23297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23297");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23298");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = null;
        slangImpl17.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl17.compiler = slangCompiler24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl17.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl17.score = score28;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl17.score = score30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl17.compiler = slangCompiler32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl17.score = score34;
        java.util.Set<java.lang.String> strSet36 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet36);
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
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test23299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23299");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23300");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23301");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
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
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23302");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23303");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23304");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23305");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23306");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23307");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23308");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23309");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
    }

    @Test
    public void test23310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23310");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23311");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass11 = strSet10.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23312");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test23313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23313");
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
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23314");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23315");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23316");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23317");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23318");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23319");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23320");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score9 = slangImpl8.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl8.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl8.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl8.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl8.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl8.score;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl8.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23321");
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
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl22.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl22.score = score26;
        java.util.Set<java.lang.String> strSet28 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl22.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl22.compiler;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl22.score = score31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl22.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl22.compiler = slangCompiler34;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet37 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet37);
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test23322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23322");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23323");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23324");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl15.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl15.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23325");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource25 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray26 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet27 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet27, slangSourceArray26);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact29 = slangImpl0.compile(slangSource25, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet27);
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(slangSourceArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test23326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23326");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl16.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl16.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl16.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl16.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl16.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl16.score = score28;
        java.util.Set<java.lang.String> strSet30 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23327");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
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
    }

    @Test
    public void test23328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23328");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23329");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test23330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23330");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet16 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl15.score = score19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl15.score = score22;
        io.cloudslang.score.api.Score score24 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl15.compiler = slangCompiler27;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl15.score = score29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet32 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet32);
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23331");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23332");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23333");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23334");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23335");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23336");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23337");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = slangImpl19.score;
        io.cloudslang.score.api.Score score26 = slangImpl19.score;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl19.eventBus = eventBus27;
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test23338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23338");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23339");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener10);
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
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23340");
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
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl0.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl0.compiler = slangCompiler31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl0.eventBus = eventBus33;
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
    }

    @Test
    public void test23341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23341");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23342");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23343");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23344");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23345");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23346");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23347");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = slangImpl0.score;
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener27 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(score26);
    }

    @Test
    public void test23348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23348");
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23349");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23350");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl24 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl24.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl24.score;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl24.score = score27;
        io.cloudslang.score.api.Score score29 = slangImpl24.score;
        io.cloudslang.score.api.Score score30 = slangImpl24.score;
        java.util.Set<java.lang.String> strSet31 = slangImpl24.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl24.compiler;
        io.cloudslang.score.api.Score score33 = slangImpl24.score;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl24.eventBus = eventBus34;
        io.cloudslang.score.api.Score score36 = null;
        slangImpl24.score = score36;
        io.cloudslang.score.events.EventBus eventBus38 = slangImpl24.eventBus;
        java.util.Set<java.lang.String> strSet39 = slangImpl24.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener23, strSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNull(eventBus38);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test23351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23351");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23352");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23353");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23354");
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
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23355");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl12.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl12.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl12.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23356");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23357");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23358");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23359");
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
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23360");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl7 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet8 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl7.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl7.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl7.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl7.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl7.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl7.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl7.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl7.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener6, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test23361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23361");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet24 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet24);
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
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23362");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23363");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23364");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = strSet18.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23365");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23366");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl12.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl12.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl12.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl12.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl12.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl12.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score25 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet26 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score27 = slangImpl12.score;
        io.cloudslang.score.api.Score score28 = slangImpl12.score;
        io.cloudslang.score.api.Score score29 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23367");
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
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23368");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23369");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23370");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23371");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23372");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23373");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test23374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23374");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23375");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23376");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl19.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl19.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl19.score = score28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl19.compiler;
        java.util.Set<java.lang.String> strSet31 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test23377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23377");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl17.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score21 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl17.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl17.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl17.compiler;
        java.util.Set<java.lang.String> strSet27 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23378");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23379");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl19.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl19.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl19.score = score28;
        java.util.Set<java.lang.String> strSet30 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl19.score = score31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl19.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score36 = slangImpl19.score;
        io.cloudslang.score.api.Score score37 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet38 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test23380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23380");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23381");
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23382");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23383");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23384");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23385");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23386");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23387");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23388");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet20 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl19.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl19.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl19.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl19.compiler = slangCompiler29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl19.eventBus;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl19.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl19.compiler;
        java.util.Set<java.lang.String> strSet34 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test23389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23389");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23390");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl12.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl12.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl12.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl12.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl12.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23391");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23392");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23393");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23394");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23395");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23396");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23397");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23398");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23399");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23400");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23401");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl0.score = score27;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(score26);
    }

    @Test
    public void test23402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23402");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score24 = slangImpl23.score;
        java.util.Set<java.lang.String> strSet25 = slangImpl23.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = null;
        slangImpl23.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl23.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl23.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl23.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl23.compiler;
        io.cloudslang.score.api.Score score32 = slangImpl23.score;
        java.util.Set<java.lang.String> strSet33 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test23403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23403");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23404");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl12.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl12.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        io.cloudslang.score.api.Score score21 = slangImpl12.score;
        io.cloudslang.score.api.Score score22 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl12.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl12.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl12.score = score26;
        java.util.Set<java.lang.String> strSet28 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23405");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23406");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl19.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl19.compiler;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet28 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl19.compiler = slangCompiler30;
        java.util.Set<java.lang.String> strSet32 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test23407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23407");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23408");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23409");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23410");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23411");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23412");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23413");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl21.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl21.eventBus = eventBus23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl21.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl21.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23414");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23415");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23416");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23417");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23418");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23419");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
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
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23420");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23421");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test23422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23422");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23423");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23424");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23425");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23426");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test23427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23427");
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
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23428");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
    }

    @Test
    public void test23429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23429");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23430");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score28 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(score28);
    }

    @Test
    public void test23431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23431");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23432");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23433");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23434");
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
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener23);
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
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test23435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23435");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test23436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23436");
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
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23437");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test23438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23438");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23439");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23440");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23441");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23442");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test23443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23443");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23444");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl19.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23445");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23446");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23447");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23448");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23449");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23450");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23451");
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
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        java.util.Set<java.lang.String> strSet26 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl0.compiler = slangCompiler27;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener29 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl30 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score31 = slangImpl30.score;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl30.eventBus = eventBus32;
        io.cloudslang.score.events.EventBus eventBus34 = null;
        slangImpl30.eventBus = eventBus34;
        io.cloudslang.score.events.EventBus eventBus36 = null;
        slangImpl30.eventBus = eventBus36;
        io.cloudslang.score.api.Score score38 = slangImpl30.score;
        io.cloudslang.score.events.EventBus eventBus39 = null;
        slangImpl30.eventBus = eventBus39;
        io.cloudslang.score.events.EventBus eventBus41 = null;
        slangImpl30.eventBus = eventBus41;
        java.util.Set<java.lang.String> strSet43 = slangImpl30.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener29, strSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test23452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23452");
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23453");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23454");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23455");
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23456");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23457");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23458");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23459");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23460");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = slangCompiler20.getClass();
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
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23461");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23462");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23463");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23464");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
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
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23465");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23466");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23467");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener17);
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
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23468");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23469");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23470");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test23471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23471");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23472");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23473");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23474");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23475");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23476");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23477");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23478");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23479");
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
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test23480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23480");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23481");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23482");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23483");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23484");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test23485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23485");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23486");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet20 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl19.compiler = slangCompiler25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl19.eventBus;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl19.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl19.eventBus = eventBus30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl19.compiler = slangCompiler32;
        java.util.Set<java.lang.String> strSet34 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl19.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl19.score = score37;
        java.util.Set<java.lang.String> strSet39 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test23487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23487");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
    }

    @Test
    public void test23488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23488");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23489");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl16.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl16.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl16.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet25 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl16.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl16.compiler = slangCompiler28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl16.eventBus = eventBus30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl16.eventBus = eventBus32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl16.compiler = slangCompiler34;
        java.util.Set<java.lang.String> strSet36 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test23490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23490");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23491");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23492");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23493");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23494");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.lang.Class<?> wildcardClass7 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23495");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl9.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl9.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl9.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl9.compiler = slangCompiler25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl9.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23496");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test23497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23497");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
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
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl14.score = score21;
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23498");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23499");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl13.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl13.score = score20;
        java.util.Set<java.lang.String> strSet22 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet22);
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
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test23500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23500");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler15);
    }
}

