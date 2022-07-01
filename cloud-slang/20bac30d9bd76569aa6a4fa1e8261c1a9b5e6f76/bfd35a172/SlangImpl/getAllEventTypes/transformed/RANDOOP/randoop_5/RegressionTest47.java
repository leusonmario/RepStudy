import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
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
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
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
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
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
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
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
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
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
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
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
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
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
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
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
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
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
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
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
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
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
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
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
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
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
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
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
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
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
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
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
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
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
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
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
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
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
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
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
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
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
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
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
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
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
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
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
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
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
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
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
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
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
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
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
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
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
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
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
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
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
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
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
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
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
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
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
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
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
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
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
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
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
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
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
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
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
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
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
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
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
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
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
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
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
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
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
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
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
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
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
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
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
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
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
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
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
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
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
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
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
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
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
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
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
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
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
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
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
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
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
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
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
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
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

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
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
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
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
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
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
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl15.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl15.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl15.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl15.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl15.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl15.score = score28;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl15.eventBus = eventBus30;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl15.score = score32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl15.score = score34;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet37 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = score17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource28 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray29 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet30 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet30, slangSourceArray29);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact32 = slangImpl0.compile(slangSource28, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(slangSourceArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
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
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = eventBus23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
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
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl10.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl10.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl10.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl10.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl10.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl10.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl10.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl20.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl20.compiler;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl20.eventBus;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl20.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        org.junit.Assert.assertNull(score3);
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl11.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl11.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl11.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl11.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
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
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl18.eventBus = eventBus20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl18.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl18.score = score24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl18.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl18.compiler = slangCompiler28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score31 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = slangImpl18.score;
        io.cloudslang.score.api.Score score34 = slangImpl18.score;
        io.cloudslang.score.events.EventBus eventBus35 = null;
        slangImpl18.eventBus = eventBus35;
        java.util.Set<java.lang.String> strSet37 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet38 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet38);
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
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
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
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
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
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl17.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl17.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl17.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl17.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl17.compiler;
        java.util.Set<java.lang.String> strSet29 = slangImpl17.getAllEventTypes();
        java.util.Set<java.lang.String> strSet30 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.lang.Class<?> wildcardClass6 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
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
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.score.api.Score score27 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = score27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score27);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
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
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl0.compiler = slangCompiler27;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener29 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener29);
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(eventBus24);
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = score20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.api.Score score25 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score25);
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener4 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl5 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score6 = slangImpl5.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl5.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl5.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl5.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl5.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl5.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl5.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl5.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener4, strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl8.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl8.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl8.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl8.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl8.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl8.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl8.compiler;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl8.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl8.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener4 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl5 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score6 = slangImpl5.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl5.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl5.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl5.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl5.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = slangImpl5.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl5.eventBus;
        java.util.Set<java.lang.String> strSet16 = slangImpl5.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener4, strSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
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
        io.cloudslang.score.api.Score score34 = null;
        slangImpl23.score = score34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl23.compiler;
        java.util.Set<java.lang.String> strSet37 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = strSet17.getClass();
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = eventBus16.getClass();
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
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
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
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score19 = slangImpl18.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl18.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl18.eventBus = eventBus25;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl18.eventBus = eventBus27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl18.compiler = slangCompiler29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl18.compiler = slangCompiler31;
        java.util.Set<java.lang.String> strSet33 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus34 = slangImpl18.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet36 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(eventBus34);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl10.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl10.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl10.eventBus;
        java.util.Set<java.lang.String> strSet19 = slangImpl10.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl10.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
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
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl0.compiler = slangCompiler27;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl13.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl13.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl13.score = score21;
        io.cloudslang.score.api.Score score23 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet24);
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet15 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl14.eventBus;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl14.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl14.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet25 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score26 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl14.eventBus = eventBus27;
        java.util.Set<java.lang.String> strSet29 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
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
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact18 = slangImpl0.compile(slangSource16, slangSourceSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet15 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl14.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl14.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl14.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl14.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl14.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl14.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl14.compiler = slangCompiler24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl14.compiler;
        java.util.Set<java.lang.String> strSet27 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl9.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl9.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl9.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl9.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl9.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl9.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl9.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl22.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl22.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl22.eventBus;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl22.score = score29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl22.compiler = slangCompiler31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl22.compiler = slangCompiler33;
        java.util.Set<java.lang.String> strSet35 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet35);
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
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl26.eventBus = eventBus28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl26.eventBus;
        io.cloudslang.score.api.Score score31 = slangImpl26.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl26.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl26.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl26.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score38 = null;
        slangImpl26.score = score38;
        io.cloudslang.score.api.Score score40 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet41 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(slangCompiler37);
        org.junit.Assert.assertNull(score40);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
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
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
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
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener32);
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
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
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
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet32);
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
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
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
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
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
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
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
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
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
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23746");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23747");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test23748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23748");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl11.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl11.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl11.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl11.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl11.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl11.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl11.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl11.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl11.eventBus;
        java.util.Set<java.lang.String> strSet26 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test23749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23749");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test23750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23750");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23751");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23752");
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
    }

    @Test
    public void test23753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23753");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl22.compiler;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl22.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl22.eventBus = eventBus28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl22.compiler = slangCompiler30;
        io.cloudslang.score.api.Score score32 = null;
        slangImpl22.score = score32;
        io.cloudslang.score.api.Score score34 = slangImpl22.score;
        io.cloudslang.score.api.Score score35 = slangImpl22.score;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet37 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus38 = null;
        slangImpl22.eventBus = eventBus38;
        io.cloudslang.score.api.Score score40 = null;
        slangImpl22.score = score40;
        io.cloudslang.score.api.Score score42 = slangImpl22.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler43 = null;
        slangImpl22.compiler = slangCompiler43;
        io.cloudslang.score.api.Score score45 = slangImpl22.score;
        java.util.Set<java.lang.String> strSet46 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet47 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(score42);
        org.junit.Assert.assertNull(score45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test23754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23754");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23755");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet18 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl17.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl17.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = slangImpl17.score;
        io.cloudslang.score.api.Score score23 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet25 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23756");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23757");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test23758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23758");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23759");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23760");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23761");
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
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23762");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23763");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23764");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23765");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23766");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23767");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23768");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
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
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test23769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23769");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23770");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test23771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23771");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23772");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23773");
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
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23774");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23775");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23776");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test23777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23777");
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
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener27 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl28 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score29 = slangImpl28.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl28.compiler = slangCompiler30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl28.eventBus = eventBus32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl28.compiler;
        io.cloudslang.score.api.Score score35 = slangImpl28.score;
        io.cloudslang.score.api.Score score36 = null;
        slangImpl28.score = score36;
        io.cloudslang.score.events.EventBus eventBus38 = null;
        slangImpl28.eventBus = eventBus38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl28.compiler;
        io.cloudslang.score.events.EventBus eventBus41 = null;
        slangImpl28.eventBus = eventBus41;
        java.util.Set<java.lang.String> strSet43 = slangImpl28.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener27, strSet43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test23778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23778");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test23779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23779");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23780");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl19.compiler = slangCompiler21;
        java.util.Set<java.lang.String> strSet23 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score24 = null;
        slangImpl19.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl19.compiler = slangCompiler26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl19.score = score29;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl19.eventBus = eventBus31;
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet33);
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
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test23781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23781");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23782");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23783");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23784");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23785");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23786");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test23787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23787");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23788");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23789");
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
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test23790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23790");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23791");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test23792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23792");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23793");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23794");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23795");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23796");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23797");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23798");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.lang.Class<?> wildcardClass19 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23799");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23800");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23801");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test23802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23802");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
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
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23803");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23804");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23805");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23806");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl16.eventBus;
        io.cloudslang.score.api.Score score21 = slangImpl16.score;
        io.cloudslang.score.api.Score score22 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23807");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23808");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23809");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23810");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test23811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23811");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23812");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23813");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23814");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test23815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23815");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23816");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23817");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl13.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test23818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23818");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23819");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl18.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl18.eventBus;
        io.cloudslang.score.api.Score score23 = slangImpl18.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl18.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl18.compiler = slangCompiler25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test23820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23820");
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
    public void test23821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23821");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23822");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test23823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23823");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test23824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23824");
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test23825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23825");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23826");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23827");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet21 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl20.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl20.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet25);
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
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test23828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23828");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener21);
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
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23829");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23830");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23831");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23832");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23833");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23834");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = slangCompiler10.getClass();
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
    public void test23835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23835");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23836");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23837");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23838");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
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
        io.cloudslang.score.api.Score score30 = null;
        slangImpl21.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl21.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = slangImpl21.compiler;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl21.score = score34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = null;
        slangImpl21.compiler = slangCompiler36;
        io.cloudslang.score.api.Score score38 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet39 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(slangCompiler33);
        org.junit.Assert.assertNull(score38);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test23839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23839");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23840");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23841");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23842");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test23843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23843");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23844");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23845");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangSource slangSource3 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray4 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet5 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet5, slangSourceArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact7 = slangImpl0.compile(slangSource3, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(slangSourceArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23846");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23847");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23848");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23849");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test23850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23850");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23851");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23852");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test23853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23853");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23854");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23855");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
    public void test23856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23856");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23857");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl15.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl15.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl15.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl15.compiler = slangCompiler24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl15.score = score26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl15.compiler = slangCompiler28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl15.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = null;
        slangImpl15.compiler = slangCompiler31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl15.compiler = slangCompiler33;
        java.util.Set<java.lang.String> strSet35 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test23858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23858");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23859");
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23860");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
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
    }

    @Test
    public void test23861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23861");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23862");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test23863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23863");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(score22);
    }

    @Test
    public void test23864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23864");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = score17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test23865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23865");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23866");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23867");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23868");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23869");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass25 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23870");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23871");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = slangImpl13.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl13.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl13.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl13.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl13.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl13.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet24);
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
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23872");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23873");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23874");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23875");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource8 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact10 = slangImpl0.compile(slangSource8, slangSourceSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test23876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23876");
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
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23877");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23878");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23879");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23880");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23881");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23882");
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test23883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23883");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test23884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23884");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23885");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23886");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23887");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23888");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23889");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23890");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23891");
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
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl26.eventBus = eventBus28;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl26.eventBus;
        java.util.Set<java.lang.String> strSet31 = slangImpl26.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl26.eventBus = eventBus32;
        io.cloudslang.score.api.Score score34 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet35 = slangImpl26.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl26.score = score37;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler39 = slangImpl26.compiler;
        java.util.Set<java.lang.String> strSet40 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(slangCompiler39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test23892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23892");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23893");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test23894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23894");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler24);
    }

    @Test
    public void test23895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23895");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
    }

    @Test
    public void test23896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23896");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl17.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl17.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl17.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl17.compiler = slangCompiler26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score29 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl17.eventBus = eventBus31;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl17.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet35);
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
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test23897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23897");
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
    }

    @Test
    public void test23898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23898");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score17 = slangImpl16.score;
        io.cloudslang.score.api.Score score18 = slangImpl16.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl16.eventBus;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl16.score = score20;
        java.util.Set<java.lang.String> strSet22 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet22);
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
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test23899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23899");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23900");
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
            slangImpl0.subscribeOnAllEvents(scoreEventListener18);
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
    public void test23901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23901");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test23902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23902");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test23903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23903");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23904");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test23905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23905");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test23906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23906");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test23907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23907");
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
        io.cloudslang.score.api.Score score29 = null;
        slangImpl0.score = score29;
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl0.eventBus = eventBus31;
        io.cloudslang.lang.compiler.SlangSource slangSource33 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray34 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet35 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet35, slangSourceArray34);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact37 = slangImpl0.compile(slangSource33, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNotNull(slangSourceArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test23908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23908");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23909");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener10 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl11 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score12 = slangImpl11.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl11.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl11.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl11.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl11.compiler = slangCompiler20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl11.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl11.score = score25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl11.score = score27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl11.eventBus;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl11.eventBus = eventBus30;
        java.util.Set<java.lang.String> strSet32 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23910");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl15.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl15.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl15.score;
        io.cloudslang.score.api.Score score21 = slangImpl15.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl15.score = score22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl15.score = score24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl15.score = score26;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test23911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23911");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test23912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23912");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23913");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23914");
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
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23915");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23916");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23917");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.score.api.Score score17 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl15.eventBus;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl15.score = score19;
        io.cloudslang.score.api.Score score21 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet23 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test23918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23918");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test23919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23919");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test23920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23920");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test23921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23921");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23922");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23923");
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
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23924");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test23925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23925");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test23926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23926");
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
        java.util.Set<java.lang.String> strSet28 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(eventBus30);
    }

    @Test
    public void test23927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23927");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23928");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.lang.Class<?> wildcardClass6 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23929");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet21 = slangImpl20.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl20.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl20.score = score24;
        io.cloudslang.score.api.Score score26 = slangImpl20.score;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl20.eventBus;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl20.score = score28;
        io.cloudslang.score.api.Score score30 = slangImpl20.score;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl20.score = score31;
        io.cloudslang.score.events.EventBus eventBus33 = slangImpl20.eventBus;
        java.util.Set<java.lang.String> strSet34 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet34);
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
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(eventBus33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test23930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23930");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23931");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23932");
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
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test23933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23933");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23934");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test23935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23935");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23936");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23937");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test23938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23938");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test23939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23939");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test23940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23940");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test23941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23941");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23942");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl0.score = score24;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test23943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23943");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23944");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
    }

    @Test
    public void test23945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23945");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23946");
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
    public void test23947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23947");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test23948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23948");
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
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl0.compiler = slangCompiler25;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(slangSourceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test23949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23949");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test23950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23950");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23951");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test23952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23952");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl18.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl18.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl18.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl18.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score30 = null;
        slangImpl18.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test23953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23953");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23954");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
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
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl18.eventBus;
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = null;
        slangImpl18.score = score29;
        java.util.Set<java.lang.String> strSet31 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl18.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test23955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23955");
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
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test23956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23956");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score9 = slangImpl8.score;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl8.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl8.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test23957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23957");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test23958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23958");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test23959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23959");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test23960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23960");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23961");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl10.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl10.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl10.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl10.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23962");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23963");
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
        java.util.Set<java.lang.String> strSet26 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener28 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler27);
    }

    @Test
    public void test23964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23964");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23965");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23966");
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23967");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test23968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23968");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23969");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test23970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23970");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23971");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test23972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23972");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(slangSourceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23973");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test23974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23974");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test23975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23975");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test23976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23976");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test23977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23977");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test23978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23978");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test23979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23979");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test23980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23980");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test23981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23981");
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
        java.util.Set<java.lang.String> strSet24 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(eventBus25);
    }

    @Test
    public void test23982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23982");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test23983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23983");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23984");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23985");
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23986");
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
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test23987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23987");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test23988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23988");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test23989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23989");
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
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener26);
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
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test23990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23990");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23991");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test23992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23992");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test23993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23993");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl19.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl19.score = score25;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl19.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl19.compiler = slangCompiler28;
        io.cloudslang.score.api.Score score30 = slangImpl19.score;
        io.cloudslang.score.api.Score score31 = slangImpl19.score;
        io.cloudslang.score.api.Score score32 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score34 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet35 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test23994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23994");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test23995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23995");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test23996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23996");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl17.compiler = slangCompiler19;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl17.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl17.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl17.compiler = slangCompiler26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl17.score = score28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl17.eventBus;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl17.eventBus;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl17.score = score33;
        io.cloudslang.score.api.Score score35 = slangImpl17.score;
        io.cloudslang.score.api.Score score36 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet37 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNull(score35);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test23997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23997");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test23998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23998");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test23999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23999");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
    }

    @Test
    public void test24000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test24000");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

