import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test21001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21001");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21002");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test21003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21003");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21004");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21005");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangSource slangSource16 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact18 = slangImpl0.compile(slangSource16, slangSourceSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21006");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21007");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21008");
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
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21009");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score22 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl21.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl21.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = slangImpl21.score;
        java.util.Set<java.lang.String> strSet28 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21010");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21011");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test21012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21012");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl20.compiler = slangCompiler22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl20.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl20.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl20.eventBus;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl20.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl20.compiler;
        java.util.Set<java.lang.String> strSet30 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test21013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21013");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21014");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler23);
    }

    @Test
    public void test21015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21015");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test21016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21016");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21017");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21018");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21019");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
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
    public void test21020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21020");
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
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
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
    public void test21021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21021");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21022");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
    }

    @Test
    public void test21023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21023");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21024");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass15 = strSet14.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test21025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21025");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21026");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21027");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21028");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test21029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21029");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21030");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21031");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test21032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21032");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test21033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21033");
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
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl0.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl0.compiler = slangCompiler24;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test21034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21034");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21035");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test21036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21036");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21037");
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
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21038");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21039");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test21040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21040");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test21041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21041");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score14 = null;
        slangImpl13.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl13.score;
        io.cloudslang.score.api.Score score17 = slangImpl13.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score19 = null;
        slangImpl13.score = score19;
        java.util.Set<java.lang.String> strSet21 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test21042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21042");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21043");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21044");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test21045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21045");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = eventBus17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21046");
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
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass26 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test21047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21047");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl10 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score11 = slangImpl10.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl10.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl10.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl10.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl10.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener9, strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21048");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21049");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test21050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21050");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl21 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl21.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl21.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl21.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl21.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl21.compiler = slangCompiler28;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl21.score = score30;
        java.util.Set<java.lang.String> strSet32 = slangImpl21.getAllEventTypes();
        io.cloudslang.score.api.Score score33 = null;
        slangImpl21.score = score33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl21.compiler;
        java.util.Set<java.lang.String> strSet36 = slangImpl21.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener20, strSet36);
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
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test21051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21051");
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
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21052");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21053");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test21054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21054");
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
        java.util.Set<java.lang.String> strSet27 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass28 = strSet27.getClass();
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
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test21055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21055");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21056");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test21057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21057");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21058");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21059");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21060");
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21061");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21062");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21063");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21064");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21065");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21066");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21067");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21068");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test21069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21069");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl18.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl18.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl18.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl18.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl18.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl18.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl18.score = score27;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test21070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21070");
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
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test21071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21071");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test21072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21072");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test21073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21073");
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
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score27 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet28 = slangImpl26.getAllEventTypes();
        io.cloudslang.score.api.Score score29 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl26.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl26.compiler;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl26.eventBus = eventBus32;
        io.cloudslang.score.api.Score score34 = slangImpl26.score;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl26.score = score35;
        io.cloudslang.score.api.Score score37 = slangImpl26.score;
        io.cloudslang.score.events.EventBus eventBus38 = slangImpl26.eventBus;
        io.cloudslang.score.api.Score score39 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet40 = slangImpl26.getAllEventTypes();
        io.cloudslang.score.api.Score score41 = null;
        slangImpl26.score = score41;
        java.util.Set<java.lang.String> strSet43 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet43);
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
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(score37);
        org.junit.Assert.assertNull(eventBus38);
        org.junit.Assert.assertNull(score39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test21074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21074");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test21075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21075");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test21076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21076");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test21077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21077");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
    }

    @Test
    public void test21078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21078");
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21079");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test21080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21080");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21081");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test21082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21082");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21083");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test21084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21084");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test21085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21085");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener23 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus22);
    }

    @Test
    public void test21086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21086");
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
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21087");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(slangSourceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21088");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
    }

    @Test
    public void test21089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21089");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test21090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21090");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21091");
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
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21092");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test21093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21093");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21094");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener7 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl8 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score9 = slangImpl8.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl8.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl8.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl8.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl8.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl8.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl8.compiler;
        io.cloudslang.score.api.Score score19 = null;
        slangImpl8.score = score19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl8.score = score21;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl8.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl8.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl8.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl8.getAllEventTypes();
        java.util.Set<java.lang.String> strSet29 = slangImpl8.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener7, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test21095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21095");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21096");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21097");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl15.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl15.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl15.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl15.eventBus;
        java.util.Set<java.lang.String> strSet24 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet26 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test21098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21098");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        java.util.Set<java.lang.String> strSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
    }

    @Test
    public void test21099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21099");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test21100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21100");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21101");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test21102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21102");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21103");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21104");
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21105");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
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
        io.cloudslang.score.api.Score score36 = slangImpl19.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test21106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21106");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
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
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test21107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21107");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test21108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21108");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21109");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21110");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21111");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21112");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test21113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21113");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test21114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21114");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        java.lang.Class<?> wildcardClass25 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test21115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21115");
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
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test21116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21116");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21117");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21118");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21119");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21120");
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
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21121");
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
        io.cloudslang.score.api.Score score16 = slangImpl15.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl15.compiler = slangCompiler17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl15.eventBus = eventBus19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl15.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl15.score;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl15.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = slangImpl15.score;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl15.score = score26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl15.score = score28;
        java.util.Set<java.lang.String> strSet30 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet30);
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
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test21122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21122");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test21123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21123");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21124");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
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
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21125");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        io.cloudslang.score.api.Score score25 = null;
        slangImpl15.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet27);
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21126");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score27 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl0.score = score30;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus29);
    }

    @Test
    public void test21127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21127");
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
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test21128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21128");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
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
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl20.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl20.compiler = slangCompiler27;
        io.cloudslang.score.api.Score score29 = slangImpl20.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test21129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21129");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21130");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21131");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21132");
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
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl0.eventBus = eventBus26;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl0.score = score28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler30);
    }

    @Test
    public void test21133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21133");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21134");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21135");
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
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test21136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21136");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        java.util.Set<java.lang.String> strSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet15);
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
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21137");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test21138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21138");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21139");
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
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test21140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21140");
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
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21141");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test21142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21142");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        java.util.Set<java.lang.String> strSet10 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass11 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test21143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21143");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21144");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21145");
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test21146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21146");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl12.getAllEventTypes();
        io.cloudslang.score.api.Score score15 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl12.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl12.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl12.getAllEventTypes();
        java.util.Set<java.lang.String> strSet23 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test21147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21147");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21148");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test21149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21149");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21150");
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
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21151");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = null;
        slangImpl0.eventBus = eventBus1;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test21152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21152");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score13 = slangImpl12.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl12.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl12.eventBus = eventBus16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score19 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl12.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score22 = slangImpl12.score;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl12.eventBus;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl12.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl12.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet27 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21153");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21154");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test21155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21155");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21156");
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
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl0.eventBus = eventBus25;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test21157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21157");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21158");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test21159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21159");
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test21160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21160");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21161");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21162");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
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
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21163");
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
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
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
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21164");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21165");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test21166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21166");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21167");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test21168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21168");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21169");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21170");
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
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21171");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21172");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21173");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test21174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21174");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.score.api.Score score21 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl19.score = score23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21175");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21176");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21177");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21178");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21179");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test21180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21180");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21181");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test21182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21182");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl20.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl20.compiler = slangCompiler24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl20.score = score26;
        io.cloudslang.score.api.Score score28 = slangImpl20.score;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl20.score = score29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl20.compiler;
        io.cloudslang.score.events.EventBus eventBus32 = slangImpl20.eventBus;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl20.eventBus = eventBus33;
        java.util.Set<java.lang.String> strSet35 = slangImpl20.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener19, strSet35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score28);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNull(eventBus32);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test21183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21183");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test21184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21184");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test21185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21185");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21186");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21187");
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21188");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21189");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test21190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21190");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.lang.Class<?> wildcardClass14 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21191");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21192");
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
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener22);
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
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test21193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21193");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21194");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21195");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21196");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = slangImpl19.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl19.compiler = slangCompiler24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl19.compiler = slangCompiler27;
        java.util.Set<java.lang.String> strSet29 = slangImpl19.getAllEventTypes();
        java.util.Set<java.lang.String> strSet30 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test21197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21197");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21198");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test21199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21199");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test21200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21200");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21201");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test21202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21202");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
    }

    @Test
    public void test21203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21203");
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
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21204");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        java.util.Set<java.lang.String> strSet21 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl19.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        java.util.Set<java.lang.String> strSet25 = slangImpl19.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl19.compiler = slangCompiler26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl19.eventBus;
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test21205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21205");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangSource slangSource22 = null;
        java.util.Set<io.cloudslang.lang.compiler.SlangSource> slangSourceSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact24 = slangImpl0.compile(slangSource22, slangSourceSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler21);
    }

    @Test
    public void test21206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21206");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21207");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21208");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21209");
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
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21210");
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test21211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21211");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test21212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21212");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test21213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21213");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(slangSourceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test21214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21214");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21215");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21216");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test21217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21217");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = eventBus11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21218");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
    }

    @Test
    public void test21219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21219");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet20 = slangImpl13.getAllEventTypes();
        java.util.Set<java.lang.String> strSet21 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl13.eventBus = eventBus22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl13.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl13.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl13.getAllEventTypes();
        io.cloudslang.score.api.Score score28 = null;
        slangImpl13.score = score28;
        io.cloudslang.score.api.Score score30 = null;
        slangImpl13.score = score30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl13.compiler = slangCompiler32;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus35 = null;
        slangImpl13.eventBus = eventBus35;
        java.util.Set<java.lang.String> strSet37 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet37);
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test21220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21220");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21221");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21222");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21223");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21224");
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21225");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(score24);
    }

    @Test
    public void test21226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21226");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus10);
    }

    @Test
    public void test21227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21227");
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21228");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21229");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21230");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21231");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
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
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl17.compiler = slangCompiler28;
        io.cloudslang.score.api.Score score30 = slangImpl17.score;
        io.cloudslang.score.api.Score score31 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl17.eventBus = eventBus32;
        java.util.Set<java.lang.String> strSet34 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test21232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21232");
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test21233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21233");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21234");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21235");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl13 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl13.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl13.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl13.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl13.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl13.score;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl13.score = score21;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl13.score = score23;
        java.util.Set<java.lang.String> strSet25 = slangImpl13.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = null;
        slangImpl13.compiler = slangCompiler26;
        java.util.Set<java.lang.String> strSet28 = slangImpl13.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21236");
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21237");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21238");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl17.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score22 = null;
        slangImpl17.score = score22;
        java.util.Set<java.lang.String> strSet24 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl17.eventBus = eventBus25;
        io.cloudslang.score.api.Score score27 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl17.eventBus;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl17.eventBus = eventBus29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl17.eventBus;
        io.cloudslang.score.api.Score score32 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl17.compiler = slangCompiler33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl17.compiler = slangCompiler35;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = null;
        slangImpl17.compiler = slangCompiler37;
        io.cloudslang.score.api.Score score39 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet40 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(score32);
        org.junit.Assert.assertNull(score39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test21239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21239");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21240");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21241");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21242");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test21243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21243");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21244");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21245");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score20 = slangImpl19.score;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl19.compiler = slangCompiler23;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl19.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl19.score;
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl19.eventBus = eventBus27;
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl19.eventBus = eventBus29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl19.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = slangImpl19.compiler;
        java.util.Set<java.lang.String> strSet33 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNull(slangCompiler32);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test21246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21246");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21247");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21248");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21249");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test21250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21250");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet24 = slangImpl23.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl23.compiler;
        java.util.Set<java.lang.String> strSet26 = slangImpl23.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl23.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl23.compiler;
        java.util.Set<java.lang.String> strSet29 = slangImpl23.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener22, strSet29);
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
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test21251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21251");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = score15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21252");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score25 = null;
        slangImpl0.score = score25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet28 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21253");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test21254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21254");
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
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl17.score = score21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = slangImpl17.compiler;
        java.util.Set<java.lang.String> strSet24 = slangImpl17.getAllEventTypes();
        java.util.Set<java.lang.String> strSet25 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test21255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21255");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet18 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl14.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet22 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test21256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21256");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21257");
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
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21258");
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21259");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
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
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21260");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21261");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test21262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21262");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test21263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21263");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test21264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21264");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
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
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet27 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl17.eventBus = eventBus28;
        java.util.Set<java.lang.String> strSet30 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl17.score = score31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl17.eventBus = eventBus33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl17.compiler;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl17.eventBus;
        java.util.Set<java.lang.String> strSet37 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus38 = null;
        slangImpl17.eventBus = eventBus38;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler40 = slangImpl17.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler41 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score42 = null;
        slangImpl17.score = score42;
        java.util.Set<java.lang.String> strSet44 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler23);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(slangCompiler40);
        org.junit.Assert.assertNull(slangCompiler41);
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test21265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21265");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test21266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21266");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener15);
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
    public void test21267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21267");
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
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
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
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21268");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test21269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21269");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test21270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21270");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21271");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = eventBus11.getClass();
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
    }

    @Test
    public void test21272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21272");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass13 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21273");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21274");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl0.score;
        io.cloudslang.score.api.Score score27 = slangImpl0.score;
        io.cloudslang.score.api.Score score28 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(score28);
    }

    @Test
    public void test21275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21275");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21276");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl19 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl19.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl19.eventBus = eventBus21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl19.eventBus;
        java.util.Set<java.lang.String> strSet24 = slangImpl19.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl19.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl19.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener18, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21277");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21278");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test21279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21279");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21280");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test21281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21281");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test21282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21282");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test21283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21283");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score18 = slangImpl17.score;
        io.cloudslang.score.api.Score score19 = slangImpl17.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl17.compiler = slangCompiler20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl17.compiler = slangCompiler22;
        java.util.Set<java.lang.String> strSet24 = slangImpl17.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score26 = slangImpl17.score;
        java.util.Set<java.lang.String> strSet27 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21284");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21285");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler9);
    }

    @Test
    public void test21286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21286");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener24 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl25 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score26 = slangImpl25.score;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl25.score = score27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl25.compiler = slangCompiler29;
        java.util.Set<java.lang.String> strSet31 = slangImpl25.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl25.compiler = slangCompiler32;
        io.cloudslang.score.api.Score score34 = slangImpl25.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = slangImpl25.compiler;
        java.util.Set<java.lang.String> strSet36 = slangImpl25.getAllEventTypes();
        java.util.Set<java.lang.String> strSet37 = slangImpl25.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener24, strSet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(score34);
        org.junit.Assert.assertNull(slangCompiler35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test21287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21287");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test21288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21288");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21289");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21290");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.api.Score score25 = slangImpl0.score;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(score25);
    }

    @Test
    public void test21291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21291");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(slangSourceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21292");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test21293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21293");
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
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21294");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet17 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = slangImpl16.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl16.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet26 = slangImpl16.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl16.compiler = slangCompiler27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus30 = slangImpl16.eventBus;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl16.score = score31;
        io.cloudslang.score.events.EventBus eventBus33 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl16.compiler = slangCompiler34;
        io.cloudslang.score.api.Score score36 = slangImpl16.score;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl16.score = score37;
        io.cloudslang.score.events.EventBus eventBus39 = null;
        slangImpl16.eventBus = eventBus39;
        io.cloudslang.score.api.Score score41 = slangImpl16.score;
        io.cloudslang.score.api.Score score42 = slangImpl16.score;
        java.util.Set<java.lang.String> strSet43 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet43);
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(slangCompiler29);
        org.junit.Assert.assertNull(eventBus30);
        org.junit.Assert.assertNull(eventBus33);
        org.junit.Assert.assertNull(score36);
        org.junit.Assert.assertNull(score41);
        org.junit.Assert.assertNull(score42);
        org.junit.Assert.assertNotNull(strSet43);
    }

    @Test
    public void test21295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21295");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test21296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21296");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test21297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21297");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21298");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = slangCompiler12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
    }

    @Test
    public void test21299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21299");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test21300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21300");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21301");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21302");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score6);
    }

    @Test
    public void test21303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21303");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21304");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
    }

    @Test
    public void test21305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21305");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = null;
        slangImpl0.compiler = slangCompiler9;
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21306");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test21307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21307");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test21308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21308");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test21309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21309");
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
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21310");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21311");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test21312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21312");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener25);
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
    public void test21313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21313");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl9 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score10 = slangImpl9.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = slangImpl9.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl9.score = score14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl9.compiler;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl9.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl9.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl9.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl9.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl9.score;
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl9.eventBus;
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl9.eventBus = eventBus25;
        java.util.Set<java.lang.String> strSet27 = slangImpl9.getAllEventTypes();
        java.util.Set<java.lang.String> strSet28 = slangImpl9.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener8, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21314");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
    }

    @Test
    public void test21315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21315");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test21316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21316");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet23 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl22.eventBus = eventBus24;
        io.cloudslang.score.api.Score score26 = null;
        slangImpl22.score = score26;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl22.eventBus;
        java.util.Set<java.lang.String> strSet29 = slangImpl22.getAllEventTypes();
        java.util.Set<java.lang.String> strSet30 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus31 = null;
        slangImpl22.eventBus = eventBus31;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl22.score = score33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl22.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl22.score = score37;
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test21317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21317");
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
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(eventBus1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test21318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21318");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(score18);
    }

    @Test
    public void test21319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21319");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass21 = strSet20.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test21320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21320");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        java.lang.Class<?> wildcardClass8 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21321");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test21322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21322");
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score16);
    }

    @Test
    public void test21323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21323");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener27 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl28 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score29 = slangImpl28.score;
        io.cloudslang.score.events.EventBus eventBus30 = null;
        slangImpl28.eventBus = eventBus30;
        io.cloudslang.score.events.EventBus eventBus32 = null;
        slangImpl28.eventBus = eventBus32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl28.score = score34;
        io.cloudslang.score.events.EventBus eventBus36 = slangImpl28.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler37 = null;
        slangImpl28.compiler = slangCompiler37;
        io.cloudslang.score.api.Score score39 = null;
        slangImpl28.score = score39;
        java.util.Set<java.lang.String> strSet41 = slangImpl28.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler42 = null;
        slangImpl28.compiler = slangCompiler42;
        java.util.Set<java.lang.String> strSet44 = slangImpl28.getAllEventTypes();
        io.cloudslang.score.api.Score score45 = slangImpl28.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler46 = null;
        slangImpl28.compiler = slangCompiler46;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler48 = null;
        slangImpl28.compiler = slangCompiler48;
        io.cloudslang.score.events.EventBus eventBus50 = null;
        slangImpl28.eventBus = eventBus50;
        io.cloudslang.score.events.EventBus eventBus52 = null;
        slangImpl28.eventBus = eventBus52;
        io.cloudslang.score.api.Score score54 = slangImpl28.score;
        java.util.Set<java.lang.String> strSet55 = slangImpl28.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener27, strSet55);
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
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNull(eventBus36);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNull(score45);
        org.junit.Assert.assertNull(score54);
        org.junit.Assert.assertNotNull(strSet55);
    }

    @Test
    public void test21324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21324");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test21325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21325");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test21326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21326");
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21327");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21328");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test21329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21329");
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
        java.util.Set<java.lang.String> strSet27 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl0.eventBus = eventBus28;
        java.lang.Class<?> wildcardClass30 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test21330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21330");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21331");
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNotNull(slangSourceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21332");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        java.lang.Class<?> wildcardClass18 = slangImpl0.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test21333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21333");
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21334");
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
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = eventBus16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21335");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test21336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21336");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test21337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21337");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.api.Score score22 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet23 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass24 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(score22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test21338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21338");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21339");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
    }

    @Test
    public void test21340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21340");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21341");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21342");
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
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
    }

    @Test
    public void test21343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21343");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test21344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21344");
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21345");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21346");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test21347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21347");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test21348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21348");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl12 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet14 = slangImpl12.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl12.compiler;
        io.cloudslang.score.api.Score score16 = null;
        slangImpl12.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl12.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl12.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl12.compiler = slangCompiler21;
        io.cloudslang.score.api.Score score23 = slangImpl12.score;
        io.cloudslang.score.api.Score score24 = null;
        slangImpl12.score = score24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl12.compiler;
        java.util.Set<java.lang.String> strSet27 = slangImpl12.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener11, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21349");
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
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test21350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21350");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21351");
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
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21352");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(slangSourceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21353");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test21354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21354");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.api.Score score21 = null;
        slangImpl0.score = score21;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21355");
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
        io.cloudslang.score.events.EventBus eventBus20 = null;
        slangImpl0.eventBus = eventBus20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score23 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl0.eventBus = eventBus24;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score23);
    }

    @Test
    public void test21356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21356");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score23 = null;
        slangImpl0.score = score23;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test21357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21357");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test21358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21358");
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
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21359");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test21360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21360");
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
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test21361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21361");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
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
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(slangSourceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test21362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21362");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21363");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass4 = strSet3.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test21364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21364");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
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
        java.util.Set<java.lang.String> strSet24 = slangImpl11.getAllEventTypes();
        io.cloudslang.score.api.Score score25 = null;
        slangImpl11.score = score25;
        java.util.Set<java.lang.String> strSet27 = slangImpl11.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener10, strSet27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test21365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21365");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test21366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21366");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
    }

    @Test
    public void test21367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21367");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21368");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl22 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score23 = slangImpl22.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = null;
        slangImpl22.compiler = slangCompiler24;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl22.eventBus = eventBus26;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = slangImpl22.compiler;
        io.cloudslang.score.api.Score score29 = slangImpl22.score;
        java.util.Set<java.lang.String> strSet30 = slangImpl22.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl22.score = score31;
        io.cloudslang.score.events.EventBus eventBus33 = null;
        slangImpl22.eventBus = eventBus33;
        io.cloudslang.score.api.Score score35 = null;
        slangImpl22.score = score35;
        io.cloudslang.score.events.EventBus eventBus37 = null;
        slangImpl22.eventBus = eventBus37;
        io.cloudslang.score.api.Score score39 = null;
        slangImpl22.score = score39;
        io.cloudslang.score.api.Score score41 = null;
        slangImpl22.score = score41;
        io.cloudslang.score.events.EventBus eventBus43 = slangImpl22.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler44 = slangImpl22.compiler;
        java.util.Set<java.lang.String> strSet45 = slangImpl22.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener21, strSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score20);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNull(slangCompiler28);
        org.junit.Assert.assertNull(score29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(eventBus43);
        org.junit.Assert.assertNull(slangCompiler44);
        org.junit.Assert.assertNotNull(strSet45);
    }

    @Test
    public void test21369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21369");
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
        io.cloudslang.score.api.Score score18 = null;
        slangImpl0.score = score18;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21370");
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
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test21371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21371");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test21372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21372");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet13 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test21373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21373");
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21374");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score20 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(score20);
    }

    @Test
    public void test21375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21375");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = null;
        slangImpl0.compiler = slangCompiler3;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler7);
    }

    @Test
    public void test21376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21376");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21377");
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
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass20 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test21378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21378");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test21379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21379");
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
        io.cloudslang.score.api.Score score20 = null;
        slangImpl0.score = score20;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler22);
    }

    @Test
    public void test21380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21380");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener14 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl15 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet17 = slangImpl15.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl15.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl15.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21381");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler10);
    }

    @Test
    public void test21382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21382");
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
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(eventBus23);
    }

    @Test
    public void test21383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21383");
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
        io.cloudslang.score.api.Score score18 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener21);
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
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21384");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = null;
        slangImpl0.score = score1;
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(score5);
    }

    @Test
    public void test21385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21385");
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
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(slangCompiler20);
    }

    @Test
    public void test21386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21386");
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
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl0.eventBus = eventBus18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21387");
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
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21388");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
    }

    @Test
    public void test21389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21389");
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
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21390");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score15 = slangImpl14.score;
        java.util.Set<java.lang.String> strSet16 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.api.Score score17 = slangImpl14.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl14.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl14.compiler = slangCompiler19;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl14.compiler;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl14.score = score22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl14.eventBus = eventBus24;
        io.cloudslang.score.events.EventBus eventBus26 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl14.score = score27;
        java.util.Set<java.lang.String> strSet29 = slangImpl14.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener13, strSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus26);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test21391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21391");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.events.EventBus eventBus7 = null;
        slangImpl0.eventBus = eventBus7;
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
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21392");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21393");
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
        java.util.Set<java.lang.String> strSet12 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test21394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21394");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.api.Score score20 = null;
        slangImpl16.score = score20;
        io.cloudslang.score.events.EventBus eventBus22 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet23 = slangImpl16.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus25 = null;
        slangImpl16.eventBus = eventBus25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl16.compiler = slangCompiler27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl16.eventBus;
        java.util.Set<java.lang.String> strSet30 = slangImpl16.getAllEventTypes();
        io.cloudslang.score.api.Score score31 = null;
        slangImpl16.score = score31;
        io.cloudslang.score.api.Score score33 = null;
        slangImpl16.score = score33;
        java.util.Set<java.lang.String> strSet35 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet35);
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test21395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21395");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21396");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener17 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl18 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet19 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl18.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl18.compiler = slangCompiler21;
        io.cloudslang.score.events.EventBus eventBus23 = slangImpl18.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus25 = slangImpl18.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl18.compiler;
        io.cloudslang.score.events.EventBus eventBus27 = slangImpl18.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler28 = null;
        slangImpl18.compiler = slangCompiler28;
        java.util.Set<java.lang.String> strSet30 = slangImpl18.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener17, strSet30);
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
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(eventBus23);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus25);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test21397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21397");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = null;
        slangImpl0.compiler = slangCompiler5;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test21398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21398");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        java.util.Set<java.lang.String> strSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener12, strSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test21399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21399");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = slangCompiler12.getClass();
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
    }

    @Test
    public void test21400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21400");
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21401");
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
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test21402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21402");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
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
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus4);
    }

    @Test
    public void test21403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21403");
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
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl0.eventBus;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(eventBus19);
    }

    @Test
    public void test21404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21404");
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
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21405");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21406");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21407");
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(eventBus17);
    }

    @Test
    public void test21408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21408");
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21409");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus5);
    }

    @Test
    public void test21410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21410");
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(slangSourceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21411");
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
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21412");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = null;
        slangImpl0.compiler = slangCompiler14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        io.cloudslang.score.api.Score score21 = slangImpl0.score;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl0.score = score22;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus16);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(score21);
    }

    @Test
    public void test21413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21413");
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNotNull(slangSourceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21414");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
    }

    @Test
    public void test21415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21415");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.lang.Class<?> wildcardClass22 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test21416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21416");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test21417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21417");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
    }

    @Test
    public void test21418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21418");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener18);
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
    }

    @Test
    public void test21419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21419");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.api.Score score2 = null;
        slangImpl0.score = score2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet11 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test21420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21420");
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
        java.util.Set<java.lang.String> strSet28 = slangImpl18.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus29 = null;
        slangImpl18.eventBus = eventBus29;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler31 = slangImpl18.compiler;
        java.util.Set<java.lang.String> strSet32 = slangImpl18.getAllEventTypes();
        java.util.Set<java.lang.String> strSet33 = slangImpl18.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = slangImpl18.compiler;
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(eventBus27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(slangCompiler31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(slangCompiler34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test21421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21421");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21422");
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
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21423");
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
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler17);
    }

    @Test
    public void test21424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21424");
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
        java.lang.Class<?> wildcardClass16 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test21425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21425");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test21426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21426");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test21427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21427");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21428");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
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
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(score9);
    }

    @Test
    public void test21429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21429");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus3 = null;
        slangImpl0.eventBus = eventBus3;
        io.cloudslang.score.api.Score score5 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = null;
        slangImpl0.compiler = slangCompiler6;
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass10 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21430");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test21431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21431");
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
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21432");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = null;
        slangImpl0.compiler = slangCompiler20;
        java.util.Set<java.lang.String> strSet22 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass23 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(score19);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test21433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21433");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler13 = null;
        slangImpl0.compiler = slangCompiler13;
        java.lang.Class<?> wildcardClass15 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test21434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21434");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test21435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21435");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = null;
        slangImpl0.score = score4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score8 = null;
        slangImpl0.score = score8;
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21436");
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(score23);
        org.junit.Assert.assertNotNull(slangSourceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test21437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21437");
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
        java.util.Set<java.lang.String> strSet16 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet17 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(slangCompiler15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test21438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21438");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21439");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score6 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        java.util.Set<java.lang.String> strSet9 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus10 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21440");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21441");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener13 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl14 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet15 = slangImpl14.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl14.eventBus = eventBus16;
        io.cloudslang.score.api.Score score18 = slangImpl14.score;
        io.cloudslang.score.events.EventBus eventBus19 = slangImpl14.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl14.eventBus = eventBus21;
        java.util.Set<java.lang.String> strSet23 = slangImpl14.getAllEventTypes();
        java.util.Set<java.lang.String> strSet24 = slangImpl14.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = null;
        slangImpl14.compiler = slangCompiler25;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = slangImpl14.compiler;
        io.cloudslang.score.events.EventBus eventBus28 = slangImpl14.eventBus;
        io.cloudslang.score.api.Score score29 = null;
        slangImpl14.score = score29;
        io.cloudslang.score.events.EventBus eventBus31 = slangImpl14.eventBus;
        java.util.Set<java.lang.String> strSet32 = slangImpl14.getAllEventTypes();
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
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(slangCompiler11);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(slangCompiler27);
        org.junit.Assert.assertNull(eventBus28);
        org.junit.Assert.assertNull(eventBus31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(eventBus33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test21442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21442");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test21443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21443");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = slangImpl0.compiler;
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
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(slangCompiler15);
    }

    @Test
    public void test21444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21444");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score2 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet3 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
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
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(slangSourceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21445");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test21446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21446");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test21447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21447");
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
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(eventBus20);
    }

    @Test
    public void test21448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21448");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = null;
        slangImpl0.compiler = slangCompiler17;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNull(score12);
    }

    @Test
    public void test21449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21449");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener22 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl23 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score24 = slangImpl23.score;
        io.cloudslang.score.api.Score score25 = slangImpl23.score;
        io.cloudslang.score.api.Score score26 = slangImpl23.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler27 = null;
        slangImpl23.compiler = slangCompiler27;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler29 = null;
        slangImpl23.compiler = slangCompiler29;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl23.score = score31;
        io.cloudslang.score.api.Score score33 = slangImpl23.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler34 = null;
        slangImpl23.compiler = slangCompiler34;
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
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(score26);
        org.junit.Assert.assertNull(score33);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test21450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21450");
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
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        java.util.Set<java.lang.String> strSet25 = slangImpl0.getAllEventTypes();
        java.lang.Class<?> wildcardClass26 = strSet25.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test21451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21451");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = null;
        slangImpl0.compiler = slangCompiler18;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler20 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus21 = null;
        slangImpl0.eventBus = eventBus21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score27 = slangImpl26.score;
        io.cloudslang.score.api.Score score28 = null;
        slangImpl26.score = score28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score31 = null;
        slangImpl26.score = score31;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler33 = null;
        slangImpl26.compiler = slangCompiler33;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler35 = null;
        slangImpl26.compiler = slangCompiler35;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl26.score = score37;
        io.cloudslang.score.api.Score score39 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet40 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler20);
        org.junit.Assert.assertNull(score27);
        org.junit.Assert.assertNull(slangCompiler30);
        org.junit.Assert.assertNull(score39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test21452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21452");
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
        io.cloudslang.score.api.Score score17 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21453");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21454");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
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
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(slangSourceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21455");
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
        java.util.Set<java.lang.String> strSet18 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test21456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21456");
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
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = null;
        slangImpl0.compiler = slangCompiler16;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21457");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.score.events.EventBus eventBus15 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus16 = null;
        slangImpl0.eventBus = eventBus16;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21458");
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
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener15 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl16 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler17 = slangImpl16.compiler;
        io.cloudslang.score.events.EventBus eventBus18 = null;
        slangImpl16.eventBus = eventBus18;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl16.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = slangImpl16.compiler;
        java.util.Set<java.lang.String> strSet22 = slangImpl16.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener15, strSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNull(slangCompiler17);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test21459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21459");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = null;
        slangImpl0.compiler = slangCompiler19;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(slangCompiler18);
    }

    @Test
    public void test21460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21460");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test21461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21461");
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21462");
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
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus8);
    }

    @Test
    public void test21463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21463");
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
        io.cloudslang.score.events.EventBus eventBus27 = null;
        slangImpl0.eventBus = eventBus27;
        io.cloudslang.lang.compiler.SlangSource slangSource29 = null;
        io.cloudslang.lang.compiler.SlangSource[] slangSourceArray30 = new io.cloudslang.lang.compiler.SlangSource[] {};
        java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource> slangSourceSet31 = new java.util.LinkedHashSet<io.cloudslang.lang.compiler.SlangSource>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet31, slangSourceArray30);
        // The following exception was thrown during execution in test generation
        try {
            io.cloudslang.lang.entities.CompilationArtifact compilationArtifact33 = slangImpl0.compile(slangSource29, (java.util.Set<io.cloudslang.lang.compiler.SlangSource>) slangSourceSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Source can not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(slangSourceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test21464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21464");
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
        io.cloudslang.score.events.EventBus eventBus24 = slangImpl15.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler25 = slangImpl15.compiler;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl15.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl15.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener14, strSet28);
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
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(eventBus24);
        org.junit.Assert.assertNull(slangCompiler25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21465");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler21 = null;
        slangImpl0.compiler = slangCompiler21;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler23 = null;
        slangImpl0.compiler = slangCompiler23;
        java.lang.Class<?> wildcardClass25 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(eventBus19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test21466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21466");
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
        io.cloudslang.score.events.EventBus eventBus14 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(eventBus11);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21467");
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
        io.cloudslang.score.api.Score score16 = null;
        slangImpl0.score = score16;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler18 = slangImpl0.compiler;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener19 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl20 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score21 = slangImpl20.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl20.compiler = slangCompiler22;
        io.cloudslang.score.events.EventBus eventBus24 = null;
        slangImpl20.eventBus = eventBus24;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl20.compiler;
        io.cloudslang.score.api.Score score27 = null;
        slangImpl20.score = score27;
        io.cloudslang.score.events.EventBus eventBus29 = slangImpl20.eventBus;
        io.cloudslang.score.api.Score score30 = slangImpl20.score;
        io.cloudslang.score.api.Score score31 = slangImpl20.score;
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
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(score15);
        org.junit.Assert.assertNull(slangCompiler18);
        org.junit.Assert.assertNull(score21);
        org.junit.Assert.assertNull(slangCompiler26);
        org.junit.Assert.assertNull(eventBus29);
        org.junit.Assert.assertNull(score30);
        org.junit.Assert.assertNull(score31);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test21468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21468");
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
        io.cloudslang.score.events.EventBus eventBus11 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(eventBus11);
    }

    @Test
    public void test21469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21469");
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
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = null;
        slangImpl0.compiler = slangCompiler22;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(slangCompiler16);
        org.junit.Assert.assertNull(eventBus21);
    }

    @Test
    public void test21470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21470");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score3 = null;
        slangImpl0.score = score3;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score7 = null;
        slangImpl0.score = score7;
        io.cloudslang.score.events.EventBus eventBus9 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
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
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNotNull(slangSourceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21471");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet2 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        java.util.Set<java.lang.String> strSet7 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet8 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler9 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        java.lang.Class<?> wildcardClass12 = slangImpl0.getClass();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21472");
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
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl0.eventBus = eventBus19;
        java.util.Set<java.lang.String> strSet21 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test21473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21473");
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
        io.cloudslang.score.events.EventBus eventBus17 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus18 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNull(eventBus14);
        org.junit.Assert.assertNull(eventBus17);
        org.junit.Assert.assertNull(eventBus18);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(slangSourceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test21474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21474");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus5 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        io.cloudslang.score.events.EventBus eventBus7 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = null;
        slangImpl0.compiler = slangCompiler8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler15 = null;
        slangImpl0.compiler = slangCompiler15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet20 = slangImpl0.getAllEventTypes();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(eventBus5);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test21475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21475");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
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
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21476");
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
        io.cloudslang.score.events.EventBus eventBus13 = null;
        slangImpl0.eventBus = eventBus13;
        java.util.Set<java.lang.String> strSet15 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.api.Score score16 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus17 = null;
        slangImpl0.eventBus = eventBus17;
        java.util.Set<java.lang.String> strSet19 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.ScoreEventListener scoreEventListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.unSubscribeOnEvents(scoreEventListener20);
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
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(score16);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test21477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21477");
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
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNull(slangCompiler9);
        org.junit.Assert.assertNotNull(slangSourceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21478");
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
        io.cloudslang.score.events.EventBus eventBus12 = null;
        slangImpl0.eventBus = eventBus12;
        io.cloudslang.score.events.EventBus eventBus14 = null;
        slangImpl0.eventBus = eventBus14;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler16 = slangImpl0.compiler;
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(slangCompiler16);
    }

    @Test
    public void test21479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21479");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler1 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score5 = null;
        slangImpl0.score = score5;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = null;
        slangImpl0.compiler = slangCompiler7;
        io.cloudslang.score.events.EventBus eventBus9 = null;
        slangImpl0.eventBus = eventBus9;
        io.cloudslang.score.events.EventBus eventBus11 = null;
        slangImpl0.eventBus = eventBus11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet14 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(eventBus4);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(eventBus15);
    }

    @Test
    public void test21480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21480");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler6 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler7 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler8 = slangImpl0.compiler;
        io.cloudslang.score.api.Score score9 = null;
        slangImpl0.score = score9;
        io.cloudslang.score.api.Score score11 = null;
        slangImpl0.score = score11;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(slangCompiler8);
    }

    @Test
    public void test21481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21481");
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
        io.cloudslang.score.events.EventBus eventBus22 = null;
        slangImpl0.eventBus = eventBus22;
        io.cloudslang.score.api.Score score24 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener25 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl26 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet27 = slangImpl26.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus28 = null;
        slangImpl26.eventBus = eventBus28;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler30 = null;
        slangImpl26.compiler = slangCompiler30;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler32 = null;
        slangImpl26.compiler = slangCompiler32;
        io.cloudslang.score.api.Score score34 = null;
        slangImpl26.score = score34;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler36 = slangImpl26.compiler;
        io.cloudslang.score.api.Score score37 = null;
        slangImpl26.score = score37;
        io.cloudslang.score.api.Score score39 = slangImpl26.score;
        java.util.Set<java.lang.String> strSet40 = slangImpl26.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener25, strSet40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(score24);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(slangCompiler36);
        org.junit.Assert.assertNull(score39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test21482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21482");
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
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(slangCompiler7);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler14);
    }

    @Test
    public void test21483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21483");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler3 = slangImpl0.compiler;
        java.util.Set<java.lang.String> strSet4 = slangImpl0.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus5 = null;
        slangImpl0.eventBus = eventBus5;
        io.cloudslang.score.api.Score score7 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.score.events.EventBus eventBus10 = null;
        slangImpl0.eventBus = eventBus10;
        io.cloudslang.score.api.Score score12 = slangImpl0.score;
        io.cloudslang.score.api.Score score13 = null;
        slangImpl0.score = score13;
        io.cloudslang.score.api.Score score15 = null;
        slangImpl0.score = score15;
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.score.api.Score score19 = slangImpl0.score;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(slangCompiler3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score19);
    }

    @Test
    public void test21484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21484");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler22 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus23 = null;
        slangImpl0.eventBus = eventBus23;
        io.cloudslang.score.api.Score score25 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler26 = slangImpl0.compiler;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(eventBus6);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(slangCompiler12);
        org.junit.Assert.assertNull(slangCompiler21);
        org.junit.Assert.assertNull(slangCompiler22);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNull(slangCompiler26);
    }

    @Test
    public void test21485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21485");
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
        io.cloudslang.score.api.Score score10 = null;
        slangImpl0.score = score10;
        io.cloudslang.score.api.Score score12 = null;
        slangImpl0.score = score12;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(eventBus9);
    }

    @Test
    public void test21486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21486");
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
        org.junit.Assert.assertNull(slangCompiler10);
        org.junit.Assert.assertNotNull(slangSourceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test21487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21487");
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
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(slangCompiler1);
        org.junit.Assert.assertNull(score10);
    }

    @Test
    public void test21488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21488");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener16 = null;
        io.cloudslang.lang.api.SlangImpl slangImpl17 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet18 = slangImpl17.getAllEventTypes();
        io.cloudslang.score.events.EventBus eventBus19 = null;
        slangImpl17.eventBus = eventBus19;
        io.cloudslang.score.events.EventBus eventBus21 = slangImpl17.eventBus;
        io.cloudslang.score.api.Score score22 = null;
        slangImpl17.score = score22;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler24 = slangImpl17.compiler;
        io.cloudslang.score.api.Score score25 = slangImpl17.score;
        io.cloudslang.score.events.EventBus eventBus26 = null;
        slangImpl17.eventBus = eventBus26;
        java.util.Set<java.lang.String> strSet28 = slangImpl17.getAllEventTypes();
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnEvents(scoreEventListener16, strSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(score12);
        org.junit.Assert.assertNull(score13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(eventBus21);
        org.junit.Assert.assertNull(slangCompiler24);
        org.junit.Assert.assertNull(score25);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test21489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21489");
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
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score2);
        org.junit.Assert.assertNull(score5);
        org.junit.Assert.assertNull(score6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(slangCompiler8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score14);
    }

    @Test
    public void test21490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21490");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.events.EventBus eventBus1 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = null;
        slangImpl0.compiler = slangCompiler4;
        io.cloudslang.score.api.Score score6 = null;
        slangImpl0.score = score6;
        io.cloudslang.score.events.EventBus eventBus8 = null;
        slangImpl0.eventBus = eventBus8;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler10 = null;
        slangImpl0.compiler = slangCompiler10;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler12 = null;
        slangImpl0.compiler = slangCompiler12;
        org.junit.Assert.assertNull(eventBus1);
    }

    @Test
    public void test21491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21491");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        java.util.Set<java.lang.String> strSet1 = slangImpl0.getAllEventTypes();
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = null;
        slangImpl0.compiler = slangCompiler2;
        io.cloudslang.score.api.Score score4 = slangImpl0.score;
        java.util.Set<java.lang.String> strSet5 = slangImpl0.getAllEventTypes();
        java.util.Set<java.lang.String> strSet6 = slangImpl0.getAllEventTypes();
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
        org.junit.Assert.assertNull(score4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(eventBus7);
    }

    @Test
    public void test21492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21492");
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
        io.cloudslang.score.api.Score score14 = null;
        slangImpl0.score = score14;
        io.cloudslang.score.events.EventBus eventBus16 = slangImpl0.eventBus;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(eventBus7);
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(slangCompiler13);
        org.junit.Assert.assertNull(eventBus16);
    }

    @Test
    public void test21493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21493");
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
        io.cloudslang.score.api.Score score17 = null;
        slangImpl0.score = score17;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler19 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus20 = slangImpl0.eventBus;
        java.lang.Class<?> wildcardClass21 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(score3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(slangCompiler19);
        org.junit.Assert.assertNull(eventBus20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test21494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21494");
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
        io.cloudslang.score.events.EventBus eventBus12 = slangImpl0.eventBus;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = eventBus12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus12);
    }

    @Test
    public void test21495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21495");
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
        io.cloudslang.score.events.ScoreEventListener scoreEventListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            slangImpl0.subscribeOnAllEvents(scoreEventListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(score8);
    }

    @Test
    public void test21496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21496");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler11 = null;
        slangImpl0.compiler = slangCompiler11;
        io.cloudslang.score.api.Score score13 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(score13);
    }

    @Test
    public void test21497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21497");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler2 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus3 = slangImpl0.eventBus;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler4 = slangImpl0.compiler;
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler5 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus6 = slangImpl0.eventBus;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler2);
        org.junit.Assert.assertNull(eventBus3);
        org.junit.Assert.assertNull(slangCompiler4);
        org.junit.Assert.assertNull(slangCompiler5);
        org.junit.Assert.assertNull(eventBus6);
    }

    @Test
    public void test21498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21498");
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
        io.cloudslang.score.events.EventBus eventBus13 = slangImpl0.eventBus;
        io.cloudslang.score.api.Score score14 = slangImpl0.score;
        io.cloudslang.score.api.Score score15 = slangImpl0.score;
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(slangCompiler6);
        org.junit.Assert.assertNull(eventBus9);
        org.junit.Assert.assertNull(eventBus12);
        org.junit.Assert.assertNull(eventBus13);
        org.junit.Assert.assertNull(score14);
        org.junit.Assert.assertNull(score15);
    }

    @Test
    public void test21499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21499");
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
        io.cloudslang.lang.compiler.SlangCompiler slangCompiler14 = slangImpl0.compiler;
        io.cloudslang.score.events.EventBus eventBus15 = null;
        slangImpl0.eventBus = eventBus15;
        java.lang.Class<?> wildcardClass17 = slangImpl0.getClass();
        org.junit.Assert.assertNull(score1);
        org.junit.Assert.assertNull(eventBus8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(slangCompiler14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test21500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test21500");
        io.cloudslang.lang.api.SlangImpl slangImpl0 = new io.cloudslang.lang.api.SlangImpl();
        io.cloudslang.score.api.Score score1 = slangImpl0.score;
        io.cloudslang.score.events.EventBus eventBus2 = null;
        slangImpl0.eventBus = eventBus2;
        io.cloudslang.score.events.EventBus eventBus4 = null;
        slangImpl0.eventBus = eventBus4;
        io.cloudslang.score.events.EventBus eventBus6 = null;
        slangImpl0.eventBus = eventBus6;
        io.cloudslang.score.api.Score score8 = slangImpl0.score;
        io.cloudslang.score.api.Score score9 = slangImpl0.score;
        io.cloudslang.score.api.Score score10 = slangImpl0.score;
        io.cloudslang.score.api.Score score11 = slangImpl0.score;
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
        org.junit.Assert.assertNull(score8);
        org.junit.Assert.assertNull(score9);
        org.junit.Assert.assertNull(score10);
        org.junit.Assert.assertNull(score11);
        org.junit.Assert.assertNull(slangCompiler12);
    }
}

