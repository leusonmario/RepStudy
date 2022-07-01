import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = languageMixin13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory22);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory20);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin23);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.language.StepDefinition stepDefinition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList21 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = languageMixin9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = languageMixin14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.StepDefinition stepDefinition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage0.objectFactory = objectFactory22;
        java.lang.Class<?> wildcardClass24 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin20);
        org.junit.Assert.assertNull(languageMixin21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.Class<?> wildcardClass20 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList21 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage0.objectFactory = objectFactory22;
        java.lang.reflect.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.StepDefinition stepDefinition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory22);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = languageMixin13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        java.lang.Class<?> wildcardClass22 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory20);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass22 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = languageMixin15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = languageMixin9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin20);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory20);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage0.objectFactory = objectFactory23;
        cuke4duke.internal.language.LanguageMixin languageMixin25 = null;
        javaLanguage0.languageMixin = languageMixin25;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory22);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList21 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = null;
        javaLanguage0.languageMixin = languageMixin22;
        cuke4duke.internal.language.StepDefinition stepDefinition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = languageMixin13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        java.lang.Class<?> wildcardClass20 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory20);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage0.objectFactory = objectFactory22;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage0.languageMixin = languageMixin21;
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin23);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.StepDefinition stepDefinition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = null;
        javaLanguage0.objectFactory = objectFactory22;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList25 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.StepDefinition stepDefinition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList7 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = languageMixin11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNull(objectFactory22);
        org.junit.Assert.assertNull(objectFactory23);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = languageMixin21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin20);
        org.junit.Assert.assertNull(languageMixin21);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = languageMixin12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory20);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = languageMixin15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass5 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        java.lang.reflect.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = null;
        javaLanguage0.languageMixin = languageMixin22;
        cuke4duke.internal.language.StepDefinition stepDefinition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass20 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        java.lang.Class<?> wildcardClass20 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = languageMixin14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }
}

