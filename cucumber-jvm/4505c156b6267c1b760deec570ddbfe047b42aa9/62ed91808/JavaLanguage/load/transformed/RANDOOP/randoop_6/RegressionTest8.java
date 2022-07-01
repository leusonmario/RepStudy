import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
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
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.StepDefinition stepDefinition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
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
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin24 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(languageMixin23);
        org.junit.Assert.assertNull(languageMixin24);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage0.languageMixin = languageMixin21;
        cuke4duke.internal.language.StepDefinition stepDefinition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
        org.junit.Assert.assertNull(objectFactory20);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
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
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList23 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin20);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        java.lang.Class<?> wildcardClass19 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin22);
        org.junit.Assert.assertNull(objectFactory23);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage0.languageMixin = languageMixin21;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = languageMixin15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        java.lang.Class<?> wildcardClass23 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
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
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin21);
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage0.objectFactory = objectFactory23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
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
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList21 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
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
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        java.lang.Class<?> wildcardClass22 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.StepDefinition stepDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
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
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.language.StepDefinition stepDefinition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
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
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory23);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory22);
        org.junit.Assert.assertNull(objectFactory23);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        org.junit.Assert.assertNull(objectFactory1);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
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
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        java.lang.Class<?> wildcardClass21 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = null;
        javaLanguage0.languageMixin = languageMixin21;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = languageMixin5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory24 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin22);
        org.junit.Assert.assertNull(languageMixin23);
        org.junit.Assert.assertNull(objectFactory24);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = objectFactory12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = null;
        javaLanguage0.objectFactory = objectFactory21;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage0.objectFactory = objectFactory23;
        java.lang.Class<?> wildcardClass25 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
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
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory20 = null;
        javaLanguage0.objectFactory = objectFactory20;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory19);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        java.lang.reflect.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
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
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.StepDefinition stepDefinition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        java.lang.Class<?> wildcardClass21 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        java.lang.Class<?> wildcardClass4 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
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
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = languageMixin13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList5 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }
}

