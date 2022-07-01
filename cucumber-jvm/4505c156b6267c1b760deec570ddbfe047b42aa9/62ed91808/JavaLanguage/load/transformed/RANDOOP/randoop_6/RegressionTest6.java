import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("hi!");
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
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin21);
        org.junit.Assert.assertNull(objectFactory22);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
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
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        java.lang.reflect.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method24);
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
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
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
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = null;
        javaLanguage0.objectFactory = objectFactory9;
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
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = objectFactory14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
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
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass17 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = javaLanguage0.loadClass("hi!");
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
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method18);
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
            javaLanguage0.registerAfterMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
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
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
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
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.StepDefinition stepDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
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
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
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
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
            javaLanguage0.load("");
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
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectFactory7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        java.lang.Class<?> wildcardClass20 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = objectFactory17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = null;
        javaLanguage0.languageMixin = languageMixin17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.Class<?> wildcardClass6 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        java.lang.Class<?> wildcardClass19 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = null;
        javaLanguage0.languageMixin = languageMixin9;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("hi!");
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
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        cuke4duke.internal.java.ObjectFactory objectFactory16 = null;
        javaLanguage0.objectFactory = objectFactory16;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
            javaLanguage0.end_scenario();
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
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
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList19 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
            java.lang.Class<?> wildcardClass10 = languageMixin9.getClass();
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList21 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        java.lang.Class<?> wildcardClass8 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = null;
        javaLanguage0.objectFactory = objectFactory12;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = null;
        javaLanguage0.languageMixin = languageMixin8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = objectFactory15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
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
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
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
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
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
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
            javaLanguage0.registerStepDefinitionMaybe(method7);
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
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.Class<?> wildcardClass19 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = languageMixin11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
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
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
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
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        cuke4duke.internal.language.LanguageMixin languageMixin23 = null;
        javaLanguage0.languageMixin = languageMixin23;
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
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition19);
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
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList23 = javaLanguage0.step_definitions_for("hi!");
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
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNull(objectFactory21);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.lang.Class<?> wildcardClass23 = javaLanguage0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("hi!");
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
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
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
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        cuke4duke.internal.java.ObjectFactory objectFactory19 = null;
        javaLanguage0.objectFactory = objectFactory19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
            java.lang.Class<?> wildcardClass13 = objectFactory12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        java.lang.reflect.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method23);
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
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList22 = javaLanguage0.step_definitions_for("hi!");
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
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList23 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        org.junit.Assert.assertNull(languageMixin17);
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
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
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
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
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
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
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        cuke4duke.internal.java.ObjectFactory objectFactory23 = null;
        javaLanguage0.objectFactory = objectFactory23;
        cuke4duke.internal.java.ObjectFactory objectFactory25 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method26);
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
        org.junit.Assert.assertNull(objectFactory25);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage0.objectFactory;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(objectFactory22);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin21);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        java.lang.Class<?> wildcardClass16 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
            javaLanguage0.registerAfterMaybe(method21);
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList16 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
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
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
            javaLanguage0.registerBeforeMaybe(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        java.lang.Class<?> wildcardClass19 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass8 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        java.lang.Class<?> wildcardClass4 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = objectFactory15.getClass();
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
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        cuke4duke.internal.java.ObjectFactory objectFactory15 = null;
        javaLanguage0.objectFactory = objectFactory15;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList20 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
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
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
            javaLanguage0.registerAfterMaybe(method12);
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
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = null;
        javaLanguage0.languageMixin = languageMixin16;
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass19 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(objectFactory18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory15);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(languageMixin17);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = null;
        javaLanguage0.objectFactory = objectFactory2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        java.lang.reflect.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
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
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
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
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
            javaLanguage0.begin_scenario();
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
            javaLanguage0.begin_scenario();
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
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = null;
        javaLanguage0.languageMixin = languageMixin12;
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
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        java.lang.Class<?> wildcardClass14 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
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
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
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
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = null;
        javaLanguage0.objectFactory = objectFactory17;
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
        org.junit.Assert.assertNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        cuke4duke.internal.language.LanguageMixin languageMixin18 = null;
        javaLanguage0.languageMixin = languageMixin18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = null;
        javaLanguage0.languageMixin = languageMixin20;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = javaLanguage0.loadClass("hi!");
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
        org.junit.Assert.assertNull(languageMixin22);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = objectFactory14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = null;
        javaLanguage0.objectFactory = objectFactory10;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
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
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory14);
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = languageMixin19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
        org.junit.Assert.assertNull(languageMixin19);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = null;
        javaLanguage0.languageMixin = languageMixin13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = null;
        javaLanguage0.languageMixin = languageMixin15;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        java.lang.reflect.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin21);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
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
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNull(objectFactory17);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
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
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        java.lang.Class<?> wildcardClass18 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        cuke4duke.internal.java.ObjectFactory objectFactory18 = null;
        javaLanguage0.objectFactory = objectFactory18;
        cuke4duke.internal.language.LanguageMixin languageMixin20 = javaLanguage0.languageMixin;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin20);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory1);
        org.junit.Assert.assertNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = null;
        javaLanguage0.objectFactory = objectFactory8;
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
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
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = null;
        javaLanguage0.languageMixin = languageMixin19;
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(objectFactory16);
        org.junit.Assert.assertNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin2 = null;
        javaLanguage0.languageMixin = languageMixin2;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin1);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("hi!");
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
        org.junit.Assert.assertNull(languageMixin12);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
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
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = objectFactory15.getClass();
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
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        cuke4duke.internal.language.LanguageMixin languageMixin11 = null;
        javaLanguage0.languageMixin = languageMixin11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        cuke4duke.internal.java.ObjectFactory objectFactory13 = null;
        javaLanguage0.objectFactory = objectFactory13;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin15);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
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
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = null;
        javaLanguage0.languageMixin = languageMixin14;
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        org.junit.Assert.assertNull(objectFactory15);
        org.junit.Assert.assertNull(languageMixin16);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        cuke4duke.internal.java.ObjectFactory objectFactory11 = null;
        javaLanguage0.objectFactory = objectFactory11;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin16);
    }
}

