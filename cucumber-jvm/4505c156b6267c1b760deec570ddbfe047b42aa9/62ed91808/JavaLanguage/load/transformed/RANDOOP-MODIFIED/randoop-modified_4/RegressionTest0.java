import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        cuke4duke.internal.language.LanguageMixin languageMixin0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cuke4duke.internal.java.JavaLanguage javaLanguage1 = new cuke4duke.internal.java.JavaLanguage(languageMixin0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing system property: cuke4duke.objectFactory");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.StepDefinition stepDefinition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        java.lang.Class<?> wildcardClass3 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.StepDefinition stepDefinition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList4 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass8 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.StepDefinition stepDefinition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList7 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        java.lang.Class<?> wildcardClass1 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        java.lang.Class<?> wildcardClass3 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList4 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList7 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass5 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList7 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = languageMixin7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass4 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.StepDefinition stepDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = languageMixin3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        java.lang.Class<?> wildcardClass6 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectFactory5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList5 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectFactory8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
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
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectFactory4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = languageMixin7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList4 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList7 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        java.lang.Class<?> wildcardClass5 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectFactory5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
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
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.reflect.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectFactory6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = null;
        javaLanguage0.objectFactory = objectFactory6;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        cuke4duke.internal.language.LanguageMixin languageMixin10 = null;
        javaLanguage0.languageMixin = languageMixin10;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        java.lang.Class<?> wildcardClass5 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        cuke4duke.internal.language.StepDefinition stepDefinition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
            javaLanguage0.begin_scenario();
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
            java.lang.Class<?> wildcardClass10 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
            java.lang.Class<?> wildcardClass11 = languageMixin10.getClass();
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        java.lang.Class<?> wildcardClass15 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
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
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        cuke4duke.internal.language.StepDefinition stepDefinition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList15 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList6 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method11);
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage0.loadClass("hi!");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList5 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.Class<?> wildcardClass6 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition14);
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = null;
        javaLanguage0.languageMixin = languageMixin6;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        java.lang.Class<?> wildcardClass9 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objectFactory13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList2 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.Class<?> wildcardClass7 = javaLanguage0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList14 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.StepDefinition stepDefinition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.Class<?> wildcardClass10 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList12 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.lang.reflect.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(languageMixin11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        java.lang.reflect.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList11 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage0.objectFactory;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method11);
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = null;
        javaLanguage0.objectFactory = objectFactory7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.junit.Assert.assertNull(objectFactory14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = null;
        javaLanguage0.languageMixin = languageMixin7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList10 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.junit.Assert.assertNull(objectFactory10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList13 = javaLanguage0.step_definitions_for("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition15);
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
            java.lang.Class<?> wildcardClass12 = javaLanguage0.loadClass("");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin4 = null;
        javaLanguage0.languageMixin = languageMixin4;
        java.lang.reflect.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(objectFactory11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = null;
        javaLanguage0.objectFactory = objectFactory4;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.Class<?> wildcardClass13 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
        org.junit.Assert.assertNull(objectFactory12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        cuke4duke.internal.java.ObjectFactory objectFactory14 = null;
        javaLanguage0.objectFactory = objectFactory14;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.begin_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Class<?> wildcardClass12 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.java.ObjectFactory objectFactory3 = null;
        javaLanguage0.objectFactory = objectFactory3;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage0.languageMixin;
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
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(objectFactory8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.reflect.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.java.ObjectFactory objectFactory1 = null;
        javaLanguage0.objectFactory = objectFactory1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerAfterMaybe(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerStepDefinitionMaybe(method11);
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        org.junit.Assert.assertNull(objectFactory18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage0.languageMixin;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.load("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
        org.junit.Assert.assertNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage0.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory8);
        org.junit.Assert.assertNull(objectFactory9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.junit.Assert.assertNull(objectFactory13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.reflect.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.registerBeforeMaybe(method13);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.lang.Class<?> wildcardClass11 = javaLanguage0.getClass();
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory6);
        org.junit.Assert.assertNull(objectFactory7);
        org.junit.Assert.assertNull(objectFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.junit.Assert.assertNull(languageMixin9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(objectFactory12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage0.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage0.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = null;
        javaLanguage0.languageMixin = languageMixin5;
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNull(objectFactory4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectFactory5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        cuke4duke.internal.language.StepDefinition stepDefinition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage0.addStepDefinition(stepDefinition13);
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        cuke4duke.internal.java.JavaLanguage javaLanguage0 = new cuke4duke.internal.java.JavaLanguage();
        cuke4duke.internal.language.LanguageMixin languageMixin1 = null;
        javaLanguage0.languageMixin = languageMixin1;
        cuke4duke.internal.language.LanguageMixin languageMixin3 = null;
        javaLanguage0.languageMixin = languageMixin3;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = null;
        javaLanguage0.objectFactory = objectFactory5;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList8 = javaLanguage0.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

